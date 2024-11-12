package Ficha3;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salario bruto:");
        double salario = scanner.nextDouble();
        System.out.println("Nº de titulares:");
        byte titulares = scanner.nextByte();
        System.out.println("Nº de dependentes:");
        byte dependentes = scanner.nextByte();
        scanner.close();
        switch (titulares) {
            case 1:
                if (salario>=500 && salario<650) {salario = salario * 0.985+ 0.005 * dependentes;}
                else if (salario>=650 && salario<800){salario = salario * 0.965+ 0.005 * dependentes;}
                else if (salario>=800 && salario<1200){salario = salario * 0.95+ 0.005 * dependentes;}
                else if (salario>=1200 && salario<2000){salario = salario * 0.9+ 0.005 * dependentes;}
                else if (salario>=2000 && salario<3000){salario = salario * 0.8+ 0.005 * dependentes;}
                else {salario = salario * 0.65+ 0.005 * dependentes;}
                
                break;

            case 2:
                if (salario>=500 && salario<650) {salario = salario * 0.975 + 0.005 * dependentes;}
                else if (salario>=650 && salario<800){salario = salario * 0.95+ 0.005 * dependentes;}
                else if (salario>=800 && salario<1200){salario = salario * 0.93+ 0.005 * dependentes;}
                else if (salario>=1200 && salario<2000){salario = salario * 0.85+ 0.005 * dependentes;}
                else if (salario>=2000 && salario<3000){salario = salario * 0.7+ 0.005 * dependentes;}
                else {salario = salario * 0.55+ 0.005 * dependentes;}
        
            default:
                break;
        }
        System.out.println("O salario liquido é de "+salario);
    }
}