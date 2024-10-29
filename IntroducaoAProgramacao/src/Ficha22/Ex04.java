package Ficha22;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduza uma letra minuscula:");
        char charMinusc = teclado.next().charAt(0);

        Random rand = new Random();
        int inteiroAleatorio = rand.nextInt(minuscParaInt(charMinusc));

        System.out.println(""+ intParaMaiusc(inteiroAleatorio));
        teclado.close();
    }
    public static int minuscParaInt(char charMinusc) {
        int inteiro = charMinusc - 'a';
        System.out.println("minuscParaInt"+ inteiro);
        return inteiro;
    }
    public static char intParaMaiusc(int inteiroAleatorio) {
        int intMaiusc = inteiroAleatorio + 'a';
        char charMaiusc = (char)intMaiusc;
        System.out.println("minuscParaInt"+ charMaiusc);
        return charMaiusc;
    }
}