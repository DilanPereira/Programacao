package Ficha4;

import java.util.Scanner;

public class Ex08 {

    static void Asteriscos(int val){
        for(int i = 0; i<val ; i++){
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de asteriscos:");
        int valor = scanner.nextInt();
        scanner.close();

        Asteriscos(valor);
    }
}
