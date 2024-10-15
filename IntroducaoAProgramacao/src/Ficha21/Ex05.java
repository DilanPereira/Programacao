package Ficha21;
import java.util.Scanner;

public class Ex05 {
    public static void main( String [] args){
        Scanner valorScanner = new Scanner(System.in);
        System.out.println("Introduzir a temperatura em Celsius:");
        float tempC = valorScanner.nextFloat();
    
        double tempF= 1.8 * tempC + 32;

        System.out.println("A temperatura em Fahrenheit é: "+tempF);
        valorScanner.close();
    }
}
