package Ficha22;

import java.lang.Math;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira as coordenadas do 1º local");
        int x1 = teclado.nextInt();
        int y1 = teclado.nextInt();
        System.out.println("Insira as coordenadas do 2º local");
        int x2 = teclado.nextInt();
        int y2 = teclado.nextInt();

        double resultado=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));

        System.out.printf("A distancia é %.4f", resultado);
        
        teclado.close();
    }
}