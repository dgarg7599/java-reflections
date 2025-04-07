package com.bridgelabz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Calculator{
    private int multiply(int a, int b){
        return a*b;
    }
}

public class InvokePrivateMethods {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Calculator calc = new Calculator();
        Class<?> cls = calc.getClass();
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);
        int result = (int) method.invoke(calc, 5 ,3);
        System.out.println("Muliplication result: " + result);
    }
}
