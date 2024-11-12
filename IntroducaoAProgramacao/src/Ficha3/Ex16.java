package Ficha3;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a cilindrada:");
        int cilindrada = scanner.nextInt();
        scanner.close();
        double imposto = 0;
        if (cilindrada<1250){
            imposto = cilindrada * 3.74 - 2417.56;
            imposto = (imposto < 0) ? 0 : imposto;
        } else {
            imposto = cilindrada * 8.86 - 8813.22;
        }
        System.out.println("O imposto a pagar é "+imposto);
    }
}
