package com.example.gson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/*  Serialization means to convert an object into that string, and deserialization is its inverse operation.*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        Employee employee = new Employee("ehsan",23,"ahsan@gmail.com");
        String json = gson.toJson(employee);

/*
        String json = "{\"age\":23,\"firstName\":\"ehsan\",\"mail\":\"ahsan@gmail.com\"}";
        Employee employee1 = gson.fromJson(json, Employee.class);
*/

        /*Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        Employee employee = new Employee("John",30,"john@mail.com");
        String jsonResult = gson.toJson(employee);

        String json = "{\"age\":30,\"firstName\":\"John\",\"mail\":\"john@mail.com\",\"password\":\"fdfarg2\"}";
        Employee employee1 = gson.fromJson(json, Employee.class);*/
    }
}

        /*
        Address address = new Address("Germany", "Berlin");

        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", 30));
        family.add(new FamilyMember("Daughter", 5));
        family.add(new FamilyMember("Father", 53));

        Employee employee = new Employee("John", 30, "john@gmail.com", address, family);
        String json = gson.toJson(employee);

        String json = "{\"address\":{\"city\":\"Berlin\",\"country\":\"Germany\"},\"age\":30,\"family\":[{\"age\":30,\"role\":\"Wife\"},{\"age\":5,\"role\":\"Daughter\"},{\"age\":53,\"role\":\"Father\"}],\"first_name\":\"John\",\"mail\":\"john@gmail.com\"}";
        Type familyType = new TypeToken<ArrayList<FamilyMember>>() {}.getType();
        ArrayList<FamilyMember> family = gson.fromJson(json, familyType);
*/
