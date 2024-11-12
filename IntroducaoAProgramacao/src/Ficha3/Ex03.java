package Ficha3;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o 1º valor:");
        int valor1 = scanner.nextInt();
        System.out.println("Insira o 2º valor:");
        int valor2 = scanner.nextInt();

        if (valor2 != 0){
            System.out.println(valor1+"/"+valor2+"="+calcDiv(valor1, valor2));
        } else {
            System.out.println("Não é possivel dividir por 0");
        }

        scanner.close();
    }
    
    static int calcDiv(int v1, int v2){
        int res = v1 / v2;
        return res;
    }
}