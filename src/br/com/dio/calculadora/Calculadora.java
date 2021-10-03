package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("Digite o primeiro valor inteiro: ");
        a = input.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        b = input.nextInt();

        int soma = soma(a,b);
        int sub = sub(a,b);
        int multi = multi(a,b);
        int div = div(a,b);

        System.out.print("Soma: "+soma);
        System.out.print("\nSubtração: "+sub);
        System.out.print("\nMultiplicação: "+multi);
        System.out.print("\nDivisão: "+div);

    }

    public static int soma(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int multi(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
}
