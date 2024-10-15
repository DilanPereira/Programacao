package Ficha21;
import java.util.Scanner;

public class Ex06 {
    public static void main( String [] args){
        Scanner valorScanner = new Scanner(System.in);
        System.out.println("Introduzir o raio do círculo:");
        float raio = valorScanner.nextFloat();
    
        double AreaCirculo= 3.14159*(raio*raio);

        System.out.println("A area do círculo é: "+AreaCirculo);
        valorScanner.close();
    }
}
