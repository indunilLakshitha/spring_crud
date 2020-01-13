package com.example.demo3.models;


import javax.persistence.*;


//model for user
@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "fName")
    private   String firstName;

    @Column(name = "lName")
    private   String lasstName;

    @Column(name = "age")
    private   Integer age;

    @Column(name = "email")
    private   String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasstName() {
        return lasstName;
    }

    public void setLasstName(String lasstName) {
        this.lasstName = lasstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
