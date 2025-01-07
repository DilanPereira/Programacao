package Ficha6;

import java.util.Scanner;

public class Ex06 {
 
    static String pedirNome(Scanner scanner){
        System.out.print("Insira o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        return nomeCompleto;
    }

    static String inverteNome(String [] nome){
        String nomeInvertido = "";

        for(int i = 1; i-1 < nome.length; i++){
            nomeInvertido = nomeInvertido + nome[nome.length - i] + " ";
        }
        
        return nomeInvertido;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCompleto = pedirNome(scanner);
        scanner.close();

        String [] nomeDividido = nomeCompleto.split(" ");

        String nomeInvertido = inverteNome(nomeDividido);

        System.out.println(nomeInvertido);
        
    }
}