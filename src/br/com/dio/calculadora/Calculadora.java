package br.com.dio.calculadora;

import java.util.Scanner;
//crtl + shift+f10 para exe o main atual
public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b= scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrir(a,b);
        int mult = mult(a,b);
        int dividir = dividir(a,b);

        System.out.println("somar: "+somar);
        System.out.println("Subt: "+ subtrair);
        System.out.println("mult: "+ mult);
        System.out.println("Div: "+dividir);
    }

    //métodos
    public static int somar(int a,int b){
        return a+b;
    }
    public static int subtrir(int a,int b){
        return a-b;
    }
    public static int mult(int a,int b){
        return a*b;
    }
    public static int dividir(int a,int b){
        return a/b;
    }
}
