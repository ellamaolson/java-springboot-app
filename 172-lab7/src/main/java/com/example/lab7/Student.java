package com.example.lab7;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String school;
    private String major;
    private int gpa;

    public Student() {

    }
    public Student(int id, String name, String school, String major, int gpa) {
        this.setId(id);
        this.setName(name);
        this.setSchool(school);
        this.setMajor(major);
        this.setGpa(gpa);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", school=" + school +
                ", major=" + major +
                ", gpa=" + gpa +
                "}";
    }
}
