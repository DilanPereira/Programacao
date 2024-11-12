package Ficha3;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Altura(metros):");
        double altura = scanner.nextDouble();
        System.out.println("Peso(kg):");
        double peso = scanner.nextDouble();
        scanner.close();
        double imc = peso / altura * altura;
        if (imc<18.5){System.out.print("Peso baixo");}
        else if (imc>=18.5 && imc<25) {System.out.print("Peso normal");}
        else if (imc>=25 && imc<30) {System.out.print("Peso execessivo");}
        else if (imc>=30) {System.out.print("Obesidade");}
    }
}
