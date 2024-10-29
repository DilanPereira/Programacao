package Ficha22;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza a letra maiuscula:");
        char maiuscula = teclado.next().charAt(0);
        teclado.close();
        System.out.println("A letra minuscula correspondente é " + trocaChar(maiuscula));
    }
    public static char trocaChar(char maiuscula) {
        int minusculaInt = maiuscula + 32;
        char minusculaChar = (char)minusculaInt;
        return minusculaChar;
    }

}