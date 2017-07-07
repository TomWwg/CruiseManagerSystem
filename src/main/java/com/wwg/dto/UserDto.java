package com.wwg.dto;

import com.wwg.entity.User;

import java.io.Serializable;

/**
 * Created by wwg on 2017/4/18 0018.
 */
public class UserDto extends PageDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String username;

    private String password;

    private String realname;

    private String sex;

    private String age;

    private String phonenumber;

    private String email;

    //用户积分
    private String integral;

    private String level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                ", integral='" + integral + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    public static User form(UserDto dto){
        User user = null;
        if(dto != null){
            user = new User();
            user.setId(dto.getId());
            user.setUsername(dto.getUsername());
            user.setSex(dto.getSex());
            user.setRealname(dto.getRealname());
            user.setPhonenumber(dto.getPhonenumber());
            user.setAge(dto.getAge());
            user.setEmail(dto.getEmail());
            user.setIntegral(dto.getIntegral());
            user.setLevel(dto.getLevel());
            user.setPassword(dto.getPassword());
            user.setSex(dto.getSex());
            user.setRealname(dto.getRealname());
            user.setPhonenumber(dto.getPhonenumber());
        }
        return user;
    }
}
