package Ficha3;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o 1º valor:");
        int valor1 = scanner.nextInt();
        System.out.println("Insira o 2º valor:");
        int valor2 = scanner.nextInt();
        System.out.println("Insira o 3º valor:");
        int valor3 = scanner.nextInt();
        scanner.close();
            if (valor1>=valor2 && valor1>=valor3){
                if(valor2>= valor3){
                    System.out.println(valor1+">"+valor2+">"+valor3);
                } else {
                    System.out.println(valor1+">"+valor3+">"+valor2);
                }
            } else if (valor2>=valor1 && valor2>=valor3){
                if(valor1>= valor3){
                    System.out.println(valor2+">"+valor1+">"+valor3);
                } else {
                    System.out.println(valor2+">"+valor3+">"+valor1);
                }
            } else if (valor3>=valor1 && valor3>=valor2){
                if(valor1>= valor2){
                    System.out.println(valor3+">"+valor1+">"+valor2);
                } else {
                    System.out.println(valor3+">"+valor2+">"+valor1);
                }
            }
    }
}
