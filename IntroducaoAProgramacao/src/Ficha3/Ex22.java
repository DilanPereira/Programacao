package Ficha3;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        System.out.println("Insira o seu estado civil (apenas o 1º caracter):");
        Scanner scanner = new Scanner(System.in);
        char estadoCivil = scanner.next().charAt(0);
        scanner.close();

        switch (estadoCivil) {
            case 'c':
            case 'C':
                System.out.println("Casado");
                break;
            case 'v':
            case 'V':
                System.out.println("Viuvo");
                break;
            case 'u':
            case 'U':
                System.out.println("União de facto");
                break;
            case 's':
            case 'S':
                System.out.println("Solteiro");
                break;
            case 'd':
            case 'D':
                System.out.println("Divorciado");
                break;
        
            default:
                System.out.println("Erro ao inserir caracter");
                break;
        }
    }
}
