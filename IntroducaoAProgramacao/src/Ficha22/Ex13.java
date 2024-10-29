package Ficha22;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira as coordenadas do 1º ponto");
        int x1 = teclado.nextInt();
        int y1 = teclado.nextInt();
        System.out.println("Insira as coordenadas do 2º ponto");
        int x2 = teclado.nextInt();
        int y2 = teclado.nextInt();

        float m=(y2-y1)/(x2-x1);
        float b=y1-x1*m;

        System.out.println("A formula é y="+m+"x+"+b+", sendo m="+m+" e b="+b);
        
        teclado.close();
    }
}