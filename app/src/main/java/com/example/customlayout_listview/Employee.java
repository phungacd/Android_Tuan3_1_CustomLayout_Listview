package com.example.customlayout_listview;

import androidx.annotation.VisibleForTesting;

public class Employee {
    private String id;
    private String name;
    private boolean gender;
    private String getId;

    public Employee() {
    }

    public Employee(String id, String name, boolean gender, String getId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.getId = getId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
