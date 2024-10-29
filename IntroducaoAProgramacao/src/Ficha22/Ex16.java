package Ficha22;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor em graus:");
            double graus = teclado.nextDouble();

            double radiano = graus / 180 * 3.14159;
            double grados = graus / 90 * 100;
            
        System.out.printf("O valor %.1f são %.4f rads e %.2f grados", graus , radiano, grados);

        teclado.close();
    }

}
