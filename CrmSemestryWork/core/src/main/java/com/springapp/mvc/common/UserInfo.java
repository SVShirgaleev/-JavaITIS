package com.springapp.mvc.common;

import javax.persistence.*;

/**
 * Created by salavatshirgaleev on 04.05.16.
 */
@Entity
@Table(name = "h_users")
public class UserInfo {





    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public UserInfo(String firstName, String lastName, String phone, String login, String hashPassword, String role, Boolean enabled) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.login = login;
        this.hashPassword = hashPassword;
        this.role = role;
        this.enabled = enabled;
    }

    private String firstName;
    private String lastName;
    private String phone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Логин пользователя для входа на сайт, он же email
     */
    private String login;

    /**
     * hash пароля пользователя
     */
    private String hashPassword;

    /**
     * Права доступа пользователя (возможные значения 'ROLE_USER', 'ROLE_ADMIN')
     */
    private String role;


    /**
     * Флаг, что пользователь подтвержден и активен.
     */
    private Boolean enabled;

    public UserInfo() {
    }


}
