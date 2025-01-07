package Ficha6;

import java.util.Scanner;

public class Ex05 {

    static String pedirNome(Scanner scanner){
        System.out.print("Insira o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        return nomeCompleto;
    }

    static String nomeMaior(String [] nome){
        String maior = "";
        for(int i = 0; i < nome.length; i++){
            if(nome[i].length() >= maior.length()){
                maior = nome[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCompleto = pedirNome(scanner);
        scanner.close();

        String [] nomeDividido = nomeCompleto.split(" ");
        
        String nomeMaior = nomeMaior(nomeDividido);

        System.out.println("O nome maior é "+nomeMaior);
    }
}
