package Ficha3;

import java.util.Scanner;

public class Ex21 {

    static void Calcular(double v1, char op, double v2){
        switch (op) {
            case '+':
                System.out.println(v1+" + "+v2+" = "+(double)(v1+v2));
                break;
            case '-':
                System.out.println(v1+" - "+v2+" = "+(double)(v1-v2));
                break;
            case '*':
                System.out.println(v1+" x "+v2+" = "+(double)(v1*v2));
                break;
            case '/':
                System.out.println(v1+" / "+v2+" = "+(double)(v1/v2));
                break;
        
            default:
                break;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o 1º Numero:");
        double valor1 = scanner.nextDouble();
        System.out.println("Insira a operação (+, -, x, /):");
        char op = scanner.next().charAt(0);
        System.out.println("Insira o 2º Numero:");
        double valor2 = scanner.nextDouble();

        Calcular(valor1, op, valor2);

        scanner.close();
    }
}
