package Ficha22;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o preço original:");
        float precoOriginal = teclado.nextFloat();
        System.out.println("Insira o desconto em percentagem:");
        int descontoPerc = teclado.nextInt();

        double precoFinal = precoOriginal * (1 - descontoPerc / 100.0);
        double desconto = precoOriginal - precoFinal;

        System.out.printf("Preço: %,5.2f\n", precoOriginal);
        System.out.printf("Desconto em percentagem: %,3d\n", descontoPerc);
        System.out.printf("Preço final: %,5.2f\n", precoFinal);
        System.out.printf("Desconto: %.2f\n", desconto);


        teclado.close();
    }
}
