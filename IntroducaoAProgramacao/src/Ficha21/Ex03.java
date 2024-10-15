package Ficha21;
import java.util.Scanner;

public class Ex03 {
    public static void main( String [] args){
        Scanner valorScanner = new Scanner(System.in);
        System.out.println("Introduzir 1º valor:");
        int valor1 = valorScanner.nextInt();
        System.out.println("Introduzir 2º valor:");
        int valor2 = valorScanner.nextInt();
        int produto = valor1 * valor2;
        int divisao = valor1 / valor2;
        int resto = valor1 % valor2;
        int quadradoValor1= valor1 * valor1;
        int quadradoValor2= valor2 * valor2;

        System.out.println("a. O produto de "+valor1+" e "+ valor2+ " é "+produto );
        System.out.println("b. A divisão de "+valor1+" e "+ valor2+ " é "+divisao+" com resto "+resto );
        System.out.println("c. O quadrado de "+valor1+" é "+quadradoValor1+ " e o quadrado de "+valor2+" é "+quadradoValor2 );
        
        valorScanner.close();
    }
}
