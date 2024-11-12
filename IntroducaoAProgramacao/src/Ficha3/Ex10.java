package Ficha3;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor:");
        int valor = scanner.nextInt();
        scanner.close();
        System.out.println(determinar(valor) ? "É par" : "É impar");
    }

    static boolean determinar(int detPar){
        int resultado = detPar % 2;
        return resultado == 0;
    }
}
