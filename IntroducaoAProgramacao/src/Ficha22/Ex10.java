package Ficha22;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreve 3 booleans (false ou true):");
        boolean valor1 = teclado.nextBoolean();
        boolean valor2 = teclado.nextBoolean();
        boolean valor3 = teclado.nextBoolean();
        
        // XOR
        boolean resultado = valor1 ^ valor2 ^ valor3;
        
        System.out.println(resultado);
        teclado.close();
    }
}
