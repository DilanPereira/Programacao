package Ficha22;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira as coordenadas do 1º local");
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        System.out.println("Insira as coordenadas do 2º local");
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        double resultado=60*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));

        System.out.println("A distancia é "+resultado);
        
        teclado.close();
    }
}
