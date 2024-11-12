package Ficha3;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salario:");
        double salario = scanner.nextDouble();
        scanner.close();
        if (salario<800) {salario = salario * 1.15;}
        else if (salario<=800 && salario>=1000){salario = salario * 1.1;}
        else if (salario>1000){salario = salario * 1.05;}
        System.out.println("Vai começar a receber "+salario);
    }
}
