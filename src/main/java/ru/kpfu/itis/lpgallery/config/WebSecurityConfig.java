package ru.kpfu.itis.lpgallery.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Qualifier(value = "customUserDetailsService")
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
//                        .antMatchers("/css/**", "/img/**", "/js/**", "/user-data/**", "/signUp", "/main").permitAll()
//                        .antMatchers("/addModel").permitAll()
//                        .antMatchers("/authors").permitAll()
//                        .antMatchers("/test-page").permitAll()
//                        .antMatchers("/").permitAll()
//                        .anyRequest().authenticated()
                        .anyRequest().permitAll()
                        .and()
                .exceptionHandling()
                        .accessDeniedPage("/accessDenied")
                        .and()
                .formLogin()
                        .loginPage("/login")
                        .defaultSuccessUrl("/main")
                        .failureUrl("/login?error")
                        .permitAll()
                        .and()
                .logout()
                        .permitAll()
                        .logoutSuccessUrl("/main")
                        .and()
                .csrf();
    }

    @Autowired
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
