package com.geekster.SpringAnnotations;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
        System.out.println("Student called from Spring framework-2"+this.name);
    }
    public Student(){
        System.out.println("Student called from Spring framework-1");
    }
}
