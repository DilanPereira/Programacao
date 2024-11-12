package Ficha3;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor:");
        double valor = scanner.nextDouble();
        scanner.close();

        valorAbsoluto(valor);
    }

    static void valorAbsoluto(double valor){
        if (valor<0){
            valor = -valor;
            System.out.println("O valor absoluto é "+valor);
        } else {
            System.out.println("O valor absoluto é "+valor);
        }
    }
}
