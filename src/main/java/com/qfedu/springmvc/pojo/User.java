package com.qfedu.springmvc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Mengxy on 2018/6/9.
 */
public class User {
    private String username;
    private String password;
    private String email;
    private Integer age;
    private Address address;
    //@DateTimeFormat(pattern = "yyyy-MM-dd")  解决日期类型的方式之一  不建议用
    private Date birthday;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", birthday=" + birthday +
                '}';
    }
}
