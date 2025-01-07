package Ficha4;

import java.util.Scanner;

public class Ex24 {

    static void desenharQuadrado(int num){
        for(int i = 0; i < num  ; i++ ){
                switch (i%2==0) {
                    case true:
                        for (int j = 0; j < num ; j++){
                            System.out.print("X ");
                        }
                        System.out.println();
                    break;

                    case false:
                        for (int j = 0; j < num ; j++){
                            System.out.print(" X");
                        }
                        System.out.println();
                    break;
                }

        }
    }

    public static void main(String[] args) {
        System.out.println("Insira o nº de quadrados:");
        Scanner teclado = new Scanner(System.in);
            int numQuadrados = teclado.nextInt();
        teclado.close();

        desenharQuadrado(numQuadrados);
    }
}
