package Ficha3;

import java.util.Scanner;

public class Ex07 {

    static void anoBissexto(int ano){
        if(ano%4==0 && ano%100!=0 || ano%400==0){
            System.out.println(ano+" é um ano bissexto");
        } else {System.out.println(ano+" não é um ano bissexto");}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um ano:");
        int ano = scanner.nextInt();
        scanner.close();
        anoBissexto(ano);

    }
}
