package ru.kpfu.itis.lpgallery.models.forms;

public class LoginForm {

    private String nickname;
    private String password;

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
