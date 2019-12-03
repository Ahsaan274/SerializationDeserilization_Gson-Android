package com.example.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FamilyMember {
    @SerializedName("role")
    private String mRole;
    @SerializedName("age")
    private int mAge;
    //@SerializedName("family")

    //private List<FamilyMember> mFamily;
    public FamilyMember(String role, int age) {
        mRole = role;
        mAge = age;
    }
}