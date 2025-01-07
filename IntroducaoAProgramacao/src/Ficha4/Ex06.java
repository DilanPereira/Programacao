package Ficha4;

import java.util.Scanner;

public class Ex06 {

    static void calcularElevado(int num, int exp){
        int numOrig = num;
        for(int i = 1; i < exp; i++){
            num = num * numOrig;
        }
        System.out.println(numOrig +"^"+ exp +"="+ num );

    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva um valor:");
        int num = teclado.nextInt();
        System.out.println("Escreva um numero para elevar");
        int exp = teclado.nextInt();
        teclado.close();

        calcularElevado(num, exp);

    }
}
