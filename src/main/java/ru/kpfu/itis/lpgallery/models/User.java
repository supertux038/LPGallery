package ru.kpfu.itis.lpgallery.models;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Length(max = 16)
    @Column(nullable = false, unique = true)
    private String nickname;

    @NotBlank
    private String email;

    private String avatar_path = "default.png";

    @NotBlank
    @Length(min = 8)
    @Column(nullable = false)
    private String hashPassword;

    @NotBlank
    @Transient
    private String passwordConfirm;

    private String remember_me_key;

    @Enumerated(value = EnumType.STRING)
    private State state;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private List<Role> roles;

    @OneToMany
    @CollectionTable(name = "models")
    private Set<Model> models;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return hashPassword;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getAvatarPath() {
        return avatar_path;
    }

    public User(String nickname, String avatar_path) {
        this.nickname = nickname;
        this.avatar_path = avatar_path;
    }
}
