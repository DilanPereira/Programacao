package Ficha21;
import java.util.Scanner;

public class Ex08 {
    public static void main( String [] args){
        Scanner valorScanner = new Scanner(System.in);
        System.out.println("Introduzir 1º nota (0 a 200):");
        short nota1 = valorScanner.nextShort();
        System.out.println("Introduzir 2º nota (0 a 200):");
        short nota2 = valorScanner.nextShort();
        System.out.println("Introduzir 3º nota (0 a 200):");
        short nota3 = valorScanner.nextShort();

        float media=(nota1+nota2+nota3)/3;

        System.out.println("A média das notas é "+media);
        valorScanner.close();
    }
}