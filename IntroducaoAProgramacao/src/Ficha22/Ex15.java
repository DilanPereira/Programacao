package Ficha22;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira uma quantidade de segundos");
        int segIntroduzidos = teclado.nextInt();
        double horas = segIntroduzidos / 3600.0;
        double horasDec = horas - (int)horas;
        double minutos = horasDec * 60;
        double minutosDec = minutos - (int)minutos;
        double segundos = minutosDec * 60;

        System.out.println((int)horas+"h"+(int)minutos+"m"+(int)segundos+"s");

     teclado.close();
    }
}
