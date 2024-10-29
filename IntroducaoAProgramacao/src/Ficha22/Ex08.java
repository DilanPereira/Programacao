package Ficha22;
import java.util.Scanner;
import java.util.Random;

public class Ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza o limite inferior");
        int valor1 = teclado.nextInt();
        System.out.println("Introduza o limite superior");
        int valor2 = teclado.nextInt();
        
        Random rand = new Random();
        int valorRandom = rand.nextInt(valor1, valor2);

        System.out.println("O numero aleatorio entre "+valor1+" e "+valor2+" foi: "+valorRandom);

        teclado.close();
    }
}
