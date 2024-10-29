package Ficha22;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreve 3 booleans (false ou true):");
        boolean valor1 = teclado.nextBoolean();
        boolean valor2 = teclado.nextBoolean();
        boolean valor3 = teclado.nextBoolean();
        
        if(valor1 == false && valor2 == false && valor3 == true || 
           valor1 == false && valor2 == true && valor3 == false ||
           valor1 == true && valor2 == false && valor3 == false ||
           valor1 == true && valor2 == true && valor3 == true){
            System.out.println("true");
           } else {
            System.out.println("false");
           }

        teclado.close();
    }
}
