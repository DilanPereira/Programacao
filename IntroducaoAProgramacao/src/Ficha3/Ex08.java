package Ficha3;

import java.util.Scanner;

public class Ex08 {

    static void valorIntervalo(int valor){
        if(valor>=50 && valor<=100){}else if(valor<50){valor=50;} else if(valor>100){valor=100;}
        System.out.println("O valor "+valor+" está no intervalo [50;100]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor entre 50 e 100:");
        int valor = scanner.nextInt();

        valorIntervalo(valor);

        scanner.close();
    }
}
