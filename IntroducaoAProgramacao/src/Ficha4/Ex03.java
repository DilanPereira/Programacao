package Ficha4;

import java.util.Scanner;

public class Ex03 {

    static void somaValores(int lim){
        int soma = 0;
        while(soma<lim){
            soma = soma + 1;
        }
        System.out.println("O nº total de somas é "+soma);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um limite");
        int limite = scanner.nextInt();
        scanner.close();

        somaValores(limite);
    }
}
