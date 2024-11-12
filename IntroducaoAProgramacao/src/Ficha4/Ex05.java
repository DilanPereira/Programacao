package Ficha4;

import java.util.Scanner;

public class Ex05 {

    static void Investimento(double din, double jur, int anos){
        int i = 0;
        while (i<anos){
            double resultado = din*Math.exp(jur*i);
            System.out.println("Ano "+i+": "+resultado);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o dinheiro investido");
        double dinheiro = scanner.nextDouble();
        System.out.println("Insira os juros");
        double juros = scanner.nextDouble();
        System.out.println("Insira os anos");
        int anos = scanner.nextInt();
        scanner.close();

        Investimento(dinheiro, juros, anos);
    }
}
