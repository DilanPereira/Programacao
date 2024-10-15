package Ficha21;
import java.util.Scanner;

public class Ex02 {
    public static void main( String [] args){
        Scanner valorScanner = new Scanner(System.in);
        System.out.println("Introduzir 1º valor:");
        int valor1 = valorScanner.nextInt();
        System.out.println("Introduzir 2º valor:");
        int valor2 = valorScanner.nextInt();
        System.out.println("Introduzir 3º valor:");
        int valor3 = valorScanner.nextInt();
    int Soma = valor1 + valor2+ valor3;
    System.out.println(valor1+" + "+ valor2+ " + "+ valor3+ " = "+ Soma );
    valorScanner.close();
    }
}