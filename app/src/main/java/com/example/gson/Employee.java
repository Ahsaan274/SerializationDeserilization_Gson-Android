package com.example.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employee {
    @Expose
    private String firstName;
    // @Expose(serialize = false)
    private int age;
    //@Expose(deserialize = false)
    private String mail;
    //for nested obj
    @SerializedName("address")
    private Address mAddress;
    //transient
    //private String password;
//, String password
    public Employee(String firstName, int age, String mail) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
        //  this.password = password;
    }
}