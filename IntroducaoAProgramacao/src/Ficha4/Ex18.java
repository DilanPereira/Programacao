package Ficha4;

import java.util.Scanner;

public class Ex18 {

        static void juntaChar(){
        Scanner scanner = new Scanner(System.in);
        char texto = ';';
        do{
            System.out.println("Insira um valor:");
            texto = scanner.next().charAt(0);
            if(texto>=65 && texto<=90 || texto>=97 && texto<=122 ){
                System.out.println(texto);
            }

        } while (texto != 46);
        scanner.close();

    }

    public static void main(String[] args) {
        juntaChar();
    }
}
