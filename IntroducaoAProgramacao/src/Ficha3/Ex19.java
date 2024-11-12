package Ficha3;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salario bruto:");
        double salario = scanner.nextDouble();
        scanner.close();
        if (salario>=500 && salario<650) {salario = salario * 0.985;}
        else if (salario>=650 && salario<800){salario = salario * 0.965;}
        else if (salario>=800 && salario<1200){salario = salario * 0.95;}
        else if (salario>=1200 && salario<2000){salario = salario * 0.9;}
        else if (salario>=2000 && salario<3000){salario = salario * 0.8;}
        else {salario = salario * 0.65;}
        System.out.println("O salario liquido é de "+salario);
    }
}