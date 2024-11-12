package Ficha4;

import java.util.Scanner;

public class Ex20 {

    static void quantidadeAsteriscos(){
        int valor=0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("\nInsira a quantidade de asteriscos:");
            valor = scanner.nextInt();

            asteriscos(valor);
        }while(valor != 0);
        scanner.close();
    }

    static void asteriscos(int val){
        for(int i = 0; i<val ; i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
       quantidadeAsteriscos();
    }
}
