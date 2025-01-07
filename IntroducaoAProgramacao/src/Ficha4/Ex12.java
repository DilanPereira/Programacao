package Ficha4;

import java.util.Scanner;

public class Ex12 {

    static double valorAbs(double num){
        if (num < 0){
            num = num * -1;
        } else {}
        return num;
    }

    public static void main(String[] args) {
        double num = 0;

        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Insira um valor:");
            num = teclado.nextDouble();

            if(num == 0){break;};

            double numAbs = valorAbs(num);

            System.out.println("Valor introduzido: "+num+"\nValor absoluto: "+numAbs);
        } while (num != 0);

        teclado.close();

    }
}
