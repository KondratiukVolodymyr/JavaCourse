package com.models;

/**
 * Created by Администратор on 14.07.2016.
 */
public class Member {
    private String gender;
    private String name;
    private int age;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void relax() {};
    public void work(){};

    @Override
    public String toString() {
        return "Member{" +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
