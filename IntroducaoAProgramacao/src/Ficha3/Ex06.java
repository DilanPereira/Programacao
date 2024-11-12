package Ficha3;

import java.util.Scanner;

public class Ex06 {

    static double calcRaiz(double valor){
        double raiz = Math.sqrt(valor);
        System.out.println("A raiz é "+raiz);
        return raiz;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor:");
        double valorIntr = scanner.nextDouble();

        calcRaiz(valorIntr);
        scanner.close();
    }

}
