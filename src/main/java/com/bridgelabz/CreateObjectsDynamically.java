package com.bridgelabz;

import java.lang.reflect.Constructor;

class Student{
    String name;
    public Student(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Student Name: " + name);
    }
}

public class CreateObjectsDynamically {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Student.class;
        Constructor<?> constructor = cls.getDeclaredConstructor(String.class);
        Student student = (Student) constructor.newInstance("John");
        student.display();
    }
}
