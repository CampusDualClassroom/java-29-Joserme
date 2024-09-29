package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        double c;
        try {
           c = a/b;
        } catch (ArithmeticException e) {
            c = 0;
            System.out.println("Error: "+e.getMessage());
        }finally {
            System.out.println("Operación finalizada");
        }

    }
}
