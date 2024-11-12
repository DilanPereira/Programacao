package Ficha4;

import java.util.Scanner;

public class Ex01 {
    
    static void valoresIntermedios(int v1, int v2){
        for(int i = v1; i<=v2; i++){
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor");
        int valor1 = scanner.nextInt();
        System.out.println("Insira um segundo valor");
        int valor2 = scanner.nextInt();
        scanner.close();

        valoresIntermedios(valor1, valor2);
    }
}
