package Ficha21;
import java.util.Scanner;

public interface Ex04 {
    public static void main( String [] args){
        Scanner valorScanner = new Scanner(System.in);
        System.out.println("Introduzir o peso:");
        float pesoKg = valorScanner.nextFloat();
        System.out.println("Introduzir a altura(em metros)");
        float alturaMetros = valorScanner.nextFloat();

        float imc= pesoKg / (alturaMetros * alturaMetros);
        System.out.println("O seu IMC é: "+imc);
        valorScanner.close();
    }
}