package Ficha21;
import java.util.Scanner;

public class Ex09 {
    public static void main( String [] args){
        Scanner valorScanner = new Scanner(System.in);
        System.out.println("Introduzir horas:");
        short horas = valorScanner.nextShort();
        System.out.println("Introduzir minutos:");
        short minutos = valorScanner.nextShort();
        System.out.println("Introduzir segundos:");
        short segundos = valorScanner.nextShort();

        int horasEmSegundos= horas * 3600 + minutos*60 + segundos;

        System.out.println(horas+" horas, "+minutos+" minutos e "+segundos+" segundos é equivalente a "+horasEmSegundos+" segundos.");
        valorScanner.close();
    }
}
