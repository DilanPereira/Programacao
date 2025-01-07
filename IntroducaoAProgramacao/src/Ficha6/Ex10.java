package Ficha6;

import java.util.Scanner;

public class Ex10 {

    static String pedirNome(Scanner scanner){
        System.out.print("Insira o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        return nomeCompleto;
    }

    static int contaVogais(String nome){
        int quantidade = 0;
        String vogais = "aeiouAEIOUáéíóúÁÉÍÓÚâêîôûÂÊÎÔÛàèìòùÀÈÌÒÙãõÃÕ";

        for(int i = 0; i < nome.length(); i++){
            if(vogais.indexOf(nome.charAt(i)) != -1){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String nomeCompleto = pedirNome(scanner);
        scanner.close();

        System.out.println("O seu nome tem "+contaVogais(nomeCompleto)+" vogais.");
    }
}
