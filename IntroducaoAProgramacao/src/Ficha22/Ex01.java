package Ficha22;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza o character:");
        char character = teclado.next().charAt(0);
        teclado.close();
        System.out.println("O inteiro do valor introduzido é " + trocaChar(character));
    }
    public static int trocaChar(char character) {
        int valor = (int)character - '0';
        return valor;
    }
}
