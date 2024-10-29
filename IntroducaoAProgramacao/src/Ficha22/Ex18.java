package Ficha22;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o preço original:");
        double precoOriginal = teclado.nextDouble();
        System.out.println("Insira o desconto em percentagem:");
        int descontoPerc = teclado.nextInt();

        double precoFinal = precoOriginal * (1 - descontoPerc / 100.0);
        double desconto = precoOriginal - precoFinal;

        System.out.printf("%-30s | %10.2f\n","Preço:", precoOriginal);
        System.out.printf("%-30s | %10d\n","Desconto em percentagem:", descontoPerc, " ");
        System.out.printf("%-30s | %10.2f\n","Preço final:", precoFinal);
        System.out.printf("%-30s | %10.2f\n","Desconto:", desconto);


        teclado.close();
    }
}
