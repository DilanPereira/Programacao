package Ficha6;

import java.util.Scanner;

public class Ex07 {

    static String pedirNome(Scanner scanner){
        System.out.print("Insira o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        return nomeCompleto;
    }

    static int tamanhoN(Scanner scanner){
        System.out.print("Insira o tamanho para dividir:");
        int num = scanner.nextInt();

        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String nomeCompleto = pedirNome(scanner);
            int n = tamanhoN(scanner);
        scanner.close();

        int i = 0;

        for(i = 0; i < nomeCompleto.length() - n; i += n)
            System.out.println(nomeCompleto.substring(i, i+n));

        System.out.println(nomeCompleto.substring(i));
    }
}