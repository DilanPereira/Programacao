package Ficha3;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique o seu combustivel:");
        String combustivel = scanner.nextLine();
        System.out.println("Indique a sua cilindrada:");
        int cilindrada = scanner.nextInt();
        System.out.println("Indique o ano:");
        short ano = scanner.nextShort();
        scanner.close();

        char grupo = 'a';

        switch (combustivel) {
            case "gasolina": 
                if (cilindrada<=1000){grupo='a';}
                else if (cilindrada>1000 && cilindrada<= 1300){grupo='b';}
                else if (cilindrada>1300 && cilindrada<= 1750){grupo='c';}
                else if (cilindrada>1750 && cilindrada<= 2600){grupo='d';}
                else if (cilindrada>2600 && cilindrada<= 3500){grupo='e';}
                else if (cilindrada>3500){grupo='f';}
                break;

            case "gasoleo":
            case "gpl":
                if (cilindrada<=1500){grupo='a';}
                else if (cilindrada>1500 && cilindrada<= 2000){grupo='b';}
                else if (cilindrada>2000 && cilindrada<= 3000){grupo='c';}
                else if (cilindrada>3000){grupo='d';}
                break;
        
            default: System.out.println("Combustivel não reconhecido"); break;
        }

        if(ano>=1977 && ano<=1989){
            switch (grupo) {
                case 'a': System.out.println("5,19€"); break;
                case 'b': System.out.println("8,10€"); break;
                case 'c': System.out.println("10,93€"); break;
                case 'd': System.out.println("22,96€"); break;
                case 'e': System.out.println("44,22€"); break;
                case 'f': System.out.println("65,92€"); break;
                default: break;
            }
        } else if (ano>=1990 && ano<=1995){
            switch (grupo) {
                case 'a': System.out.println("8,64€"); break;
                case 'b': System.out.println("15,52€"); break;
                case 'c': System.out.println("24,15€"); break;
                case 'd': System.out.println("58,54€"); break;
                case 'e': System.out.println("92,92€"); break;
                case 'f': System.out.println("158,22€"); break;
                default: break;
            }
        } else if (ano>1995){
            switch (grupo) {
                case 'a': System.out.println("15,52€"); break;
                case 'b': System.out.println("31,00€"); break;
                case 'c': System.out.println("48,15€"); break;
                case 'd': System.out.println("121,55€"); break;
                case 'e': System.out.println("193,20€"); break;
                case 'f': System.out.println("342,20€"); break;
                default: break;
            }
        }
    }
}
