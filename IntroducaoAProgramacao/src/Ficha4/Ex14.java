package Ficha4;

import java.util.Scanner;

public class Ex14 {

    static void divisores(int num){
        System.out.println("Os seguintes numeros são divisores: ");
        for(int i = 1; i < num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            System.out.println("Insira um valor");
            int num = teclado.nextInt();
        teclado.close();

        divisores(num);
    }
}
