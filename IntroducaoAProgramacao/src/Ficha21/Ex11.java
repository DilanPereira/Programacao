package Ficha21;
import java.util.Scanner;

public class Ex11 {
    public static void main( String [] args){
        Scanner valorScanner = new Scanner(System.in);
        System.out.println("Introduzir salario base:");
        float salario = valorScanner.nextFloat();
        System.out.println("Introduzir carros vendidos:");
        byte carrosVendidos = valorScanner.nextByte();
        
        float bonusPorCarroVendido = 5.32f;
        byte comissaoPorCarro=5;
        
        float salarioFinal= salario + carrosVendidos*bonusPorCarroVendido+ carrosVendidos*comissaoPorCarro;

        System.out.println("Ao total o salário foi de: "+salarioFinal);
        valorScanner.close();
    }
}
