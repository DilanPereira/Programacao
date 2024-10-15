package Ficha21;
import java.util.Scanner;

public class Ex10 {
    public static void main( String [] args){
        Scanner valorScanner = new Scanner(System.in);
        System.out.println("Introduzir dinheiro gasto no 1º dia:");
        float dinheiroGasto = valorScanner.nextFloat();
    
        float dinheiroGastoDia2= dinheiroGasto*1.1f;
        float dinheiroGastoDia3= dinheiroGastoDia2*1.1f;
        float dinheiroGastoDia4= dinheiroGastoDia3*1.1f;

        System.out.println("No fim dos 4 dias gastou: "+dinheiroGastoDia4);
        valorScanner.close();
    }
}
