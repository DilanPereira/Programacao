package Ficha22;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o valor de um ângulo:");
        double angulo = teclado.nextDouble();

        if(Math.sin(angulo) * Math.sin(angulo) + Math.cos(angulo) * Math.cos(angulo) == 1){
            System.out.println("sen^2("+angulo+") + cos^2("+angulo+") = 1");
        } else {
            System.out.println("sen^2("+angulo+") + cos^2("+angulo+") não é 1");
        }

        teclado.close();
    }
}
