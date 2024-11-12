package Ficha3;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor:");
        double valor = scanner.nextDouble();
        scanner.close();

        System.out.println("O valor absoluto é "+valorAbsoluto(valor));
    }

    static double valorAbsoluto(double valor){
        return valor<0 ? -valor : valor;
    }
}