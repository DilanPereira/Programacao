package Ficha4;

import java.util.Scanner;

public class Ex07 {
    
    static void Factorizar(int val){
        int i = 1;
        int valInicial = val;
        while(valInicial-i>0){
            val = val * (valInicial-i);
            i++;
        }
        System.out.println(valInicial+"! = "+val);

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor para factorizar:");
        int valor = scanner.nextInt();
        scanner.close();

        Factorizar(valor);
    }
}
