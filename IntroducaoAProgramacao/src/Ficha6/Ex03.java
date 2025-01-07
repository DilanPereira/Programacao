package Ficha6;

import java.util.Scanner;

public class Ex03 {

    static String pedirNome(Scanner scanner){
        System.out.print("Insira o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        return nomeCompleto;
    }

    static int calculaEspacos(String nome){
        int espacos = 0;

        for(int i = 0; i < nome.length(); i++ ){
            if(nome.charAt(i) == ' '){
                espacos = espacos + 1;
            }
        }
        
        return espacos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCompleto = pedirNome(scanner);
        scanner.close();

        int quantEspacos = calculaEspacos(nomeCompleto);
        
        System.out.println("O nome tem "+quantEspacos+" espaços.");
    }
}
