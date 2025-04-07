package com.bridgelabz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class MathsOperations {
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> cls = MathsOperations.class;
        MathsOperations mathsOperations = new MathsOperations();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter operation you want to perform: ");
        String operation = sc.next();

        Method method = cls.getDeclaredMethod(operation, int.class, int.class);
        System.out.println("Enter two values: ");
        System.out.println("Result: " + method.invoke(mathsOperations, sc.nextInt(), sc.nextInt()));
    }
}
