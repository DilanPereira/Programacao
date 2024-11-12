package Ficha4;

import java.util.Scanner;

public class Ex02 {

    static void tabuada(int val){
        int i = 0;
        while(i<=10){
            System.out.print(val +" x "+ i +" = "+ i * val+"\n");
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor");
        int valor = scanner.nextInt();
        scanner.close();

        tabuada(valor);
    }
}
