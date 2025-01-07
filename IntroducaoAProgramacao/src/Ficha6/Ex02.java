package Ficha6;

import java.util.Scanner;

public class Ex02 {

    static String pedirNome(Scanner scanner){
        System.out.print("Insira o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        return nomeCompleto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCompleto = pedirNome(scanner);
        scanner.close();

        String [] nomeDividido = nomeCompleto.split(" ");
        System.out.println("O primeiro nome é "+ nomeDividido[0]);
    }
}
