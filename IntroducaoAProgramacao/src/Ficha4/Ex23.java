package Ficha4;

import java.util.Scanner;

public class Ex23 {

    static void leChars(){
        Scanner scanner = new Scanner(System.in);
        String introd = "  ";
        char char1= 0;
        char char2= 0;
        boolean verificacao = true;

        while(verificacao != false){
            System.out.println("\nIntroduza um par de caracteres:");
                introd=scanner.nextLine();
                    char1=introd.charAt(0);
                    char2=introd.charAt(1);
                
                    if(char1 != '.' && char2 != '.'){
                    verifChars(char1, char2);
                } else {
                    verificacao = false;
                    System.out.println("Erro na verificação");
                }
        };
        scanner.close();
    }

    static void verifChars(char char1, char char2){
        if(char1>='a' && char1<='z' && char2>='a' && char2<='z'){
            if(char1>char2){
                revEscreverChars(char1, char2);
            } else if(char1<char2){
                escreveChars(char1, char2);
            } else {System.out.println("Ambos os caracteres são "+ char1);}

        } else {System.out.println("Pelo menos um dos carateres introduzidos não é uma minúscula");}
    }

    static void escreveChars(char char1, char char2){
        System.out.print(char1);
        do{
            char1 = (char)((int)char1 + 1);
            System.out.print(char1);
        } while(char1 != char2);
    }

    static void revEscreverChars(char char1, char char2){
        System.out.print(char1);
        do{
            char1 = (char)((int)char1 - 1);
            System.out.print(char1);
        } while(char1 != char2);
    }

    public static void main(String[] args) {
        leChars();

    }
}
