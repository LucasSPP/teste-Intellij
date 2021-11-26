package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int a, b;
        System.out.println("Digite o valor");

        a = scan.nextInt();

        System.out.println("Digite o valor");

        b = scan.nextInt();
      int somar = somar(a, b);
      int subtrair = subtrair(a, b);
      int mult = mult(a, b);
      double div = div(a, b);
        System.out.println("somar= "+somar);
        System.out.println("subtrair= "+subtrair);
        System.out.println("multiplicar= "+mult);
        System.out.println("dividir= "+div);
    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int mult(int a, int b){
        return a * b;
    }

    public static double div(double a, double b){
        return a / b;
    }
}
