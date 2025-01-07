package Ficha6;

import java.util.Scanner;

public class Ex01 {

        static void pedirNome(Scanner teclado){
            System.out.print("Insira o seu nome: ");
            String nomeCompleto = teclado.nextLine();
            System.out.println("O nome tem "+ nomeCompleto.length() +" caracteres.\n"+
                               "O primeiro caracter é "+ nomeCompleto.charAt(0) +" e o ultimo é "+nomeCompleto.charAt(nomeCompleto.length()-1));
        }

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            pedirNome(teclado);
            teclado.close();
        }
}
