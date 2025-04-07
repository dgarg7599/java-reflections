package com.bridgelabz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class GetClassInfo {

    static void printClassInfo(String className) throws ClassNotFoundException {
        Class<?> cls = Class.forName(className);
        System.out.println("Class: " + cls.getName());
        System.out.println("Package: " + cls.getPackage());
        System.out.println("Constructors: ");
        for(Constructor<?> constructor : cls.getConstructors()){
            System.out.println("\t" + constructor);
        }
        System.out.println("Fields: ");
        for(Field field : cls.getFields()) {
            System.out.println("\t" + field);
        }
        System.out.println("Methods: ");
        for(Method method : cls.getMethods()) {
            System.out.println("\t" + method);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter class name: ");
        try{
            printClassInfo(sc.nextLine().trim());
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found");
        }
    }
}
