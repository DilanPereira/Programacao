package Ficha21;
import java.util.Scanner;

public class Ex07 {
    public static void main( String [] args){
        Scanner valorScanner = new Scanner(System.in);
        System.out.println("Introduzir preço original");
        float preco = valorScanner.nextFloat();
    
        byte descontoPercentagem= 20;

        float novoPreco= preco*(100-descontoPercentagem)/100;

        System.out.println("O preço "+preco+" com "+descontoPercentagem+"% é "+novoPreco);
        valorScanner.close();
    }
}
