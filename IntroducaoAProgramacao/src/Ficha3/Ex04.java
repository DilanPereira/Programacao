package Ficha3;

import java.util.Scanner;

public class Ex04 {

    static void trocaValor(int valor1, int valor2){
        int maior = valor2;
            valor2 = valor1;
            valor1 = maior;
        
        System.out.println("As variadas trocadas são: "+valor1+" e "+valor2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o 1º valor:");
        int valor1 = scanner.nextInt();
        System.out.println("Insira o 2º valor:");
        int valor2 = scanner.nextInt();
        scanner.close();
        System.out.println("As variadas são: "+valor1+" e "+valor2);
        
        if (valor1 < valor2){
            trocaValor(valor1, valor2);
        } else if (valor1 > valor2){
            System.out.println("As variadas já estão do maior para o menor");
        }
    }


}
