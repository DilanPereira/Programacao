package Ficha3;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor:");
        int valor = scanner.nextInt();
        scanner.close();
        // Caso fosse sem metodo:
        //System.out.println("O valor é "+((valor%2==0) ? "par" : "impar"));
        if (determinar(valor)==true){
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
    }

    static boolean determinar(int detPar){
        int resultado = detPar % 2;
        if (resultado == 0){
            return true;
        } else {
            return false;
        }
    }
}
