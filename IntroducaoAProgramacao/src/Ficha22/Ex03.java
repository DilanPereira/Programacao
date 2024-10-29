package Ficha22;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza um numero inteiro:");
        int valor = teclado.nextInt();
        teclado.close();
        System.out.println("O codigo correspondente é " + codigo(valor));
    }
    public static char codigo(int valor) {
        return (char)valor;
    }
}
