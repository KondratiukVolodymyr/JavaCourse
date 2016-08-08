package com.models;

public class GrandParents extends Member {
    private String surName;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void relax() {
        if (getGender().equals("М")) System.out.println(" читає газету.");
        else System.out.println(" займається в'язанням");
    }

    public void work() {
        if (getGender().equals("М")) System.out.println(" шукає сухі гілки.");
        else System.out.println(" слідкує за внуками.");
    }

    @Override
    public String toString() {
        return "GrandParents{" +
                "surName='" + surName + '\'' +
                ", additional info: " + super.toString() +
                '}';
    }


}
