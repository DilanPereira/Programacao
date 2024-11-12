package Ficha4;

import java.util.Scanner;

public class Ex19 {

    static void verificarPrimo(int val){
        int i = 2;
        if (val<=1){System.out.println("Valor incorreto");}
        else {
            while (i<=val){
                if(val%1==0 && val==i){System.out.println("O valor é primo");}
                else if(val%i==0){
                    System.out.println("O valor não é primo");
                    break;
                }
                i++;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Indique um valor");
        Scanner scanner = new Scanner(System.in);
            int valor = scanner.nextInt();
        scanner.close();
        verificarPrimo(valor);
    }
}