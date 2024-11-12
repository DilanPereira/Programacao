package Ficha4;

import java.util.Scanner;

public class Ex13 {

    static void somaPositivos(){
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        int soma = 0;
        do{
            System.out.println("Insira um valor:");
            valor = scanner.nextInt();
            if(valor>0){
                soma = soma + valor;
            }

        } while (valor != 0);
        scanner.close();
        System.out.println("A soma dos valores positivos é "+ soma);

    }

    public static void main(String[] args) {
        somaPositivos();
    }
}