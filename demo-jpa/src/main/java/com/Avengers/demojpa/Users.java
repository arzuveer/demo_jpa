package com.Avengers.demojpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
   @Id
   int rollno;
    String name;
    int age;
    String mobno;

    public Users() {
    }

    public Users(int rollno, String name, int age, String mobno) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.mobno = mobno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }
}
