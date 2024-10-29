package Ficha22;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva o 1º numero real");
        double valorDouble1 = teclado.nextDouble();
        System.out.println("Escreva o 2º numero real");
        double valorDouble2 = teclado.nextDouble();

        double somaDec = (valorDecDoValor(valorDouble1, valorIntDeDouble(valorDouble1)) + valorDecDoValor(valorDouble2, valorIntDeDouble(valorDouble2))) * 10;
        double somaAprox = Math.round(somaDec);
        int soma = (int)somaAprox;

        System.out.println("A soma das casas decimais é "+ soma);

        teclado.close();
    }
    
    public static int valorIntDeDouble(double valor){
        int resultado = (int)valor;
        return resultado;
    }
    public static double valorDecDoValor(double valorReal, int valorInteiro){
        double resultado = valorReal - valorInteiro;
        return resultado;
    }
}