package com.company;

import java.util.List;

public class Cast {

    private String fullName;
    private String role;

    public Cast(String fullName, String role) {
        this.fullName = fullName;
        this.role = role;
    }

    public  String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return
                "fullName   | " + fullName + "\t          " +
                "role  | " +   role + '\n';
    }

        }


