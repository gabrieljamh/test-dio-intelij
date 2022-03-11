package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a, b;

        System.out.printf("Digite o Primeiro Valor: ");
        a = scan.nextFloat();
        System.out.println("OK! a = " + a);
        System.out.printf("Digite o Segundo Valor: ");
        b = scan.nextFloat();
        System.out.println("OK! b = " + b);

        float add = add(a,b);
        float sub = sub(a,b);
        float div = div(a,b);
        float mult= mult(a,b);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mult);

    }
    public static float add(float a, float b) {
        return a + b;
    }

    public static float sub(float a, float b) {
        return a - b;
    }

    public static float div(float a, float b) {
        return a / b;
    }

    public static float mult(float a, float b) {
        return a * b;
    }
}
