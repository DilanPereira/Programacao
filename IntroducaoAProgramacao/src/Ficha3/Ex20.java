package Ficha3;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        System.out.println("Escreva uma data(dd/mm/aaaa):");
        Scanner scanner = new Scanner(System.in);
            String data = scanner.nextLine();
        scanner.close();

            byte dia = Byte.parseByte((String.valueOf(data.charAt(0)) + String.valueOf(data.charAt(1))));
            byte mes = Byte.parseByte((String.valueOf(data.charAt(3)) + String.valueOf(data.charAt(4))));
            short ano = Short.parseShort((String.valueOf(data.charAt(6)) + String.valueOf(data.charAt(7))+ String.valueOf(data.charAt(8))+ String.valueOf(data.charAt(9))));
            String mesString ="";
            switch (mes) {
                case 01:
                    mesString = "janeiro";
                    break;
                case 02:
                    mesString = "fevereiro";
                    break;
                case 03:
                    mesString = "março";
                    break;
                case 04:
                    mesString = "abril";
                    break;
                case 05:
                    mesString = "maio";
                    break;
                case 06:
                    mesString = "junho";
                    break;
                case 07:
                    mesString = "julho";
                    break;
                case 8:
                    mesString = "agosto";
                    break;
                case 9:
                    mesString = "setembro";
                    break;
                case 10:
                    mesString = "outubro";
                    break;
                case 11:
                    mesString = "novembro";
                    break;
                case 12:
                    mesString = "dezembro";
                    break;
            
                default:
                    System.out.println("Mes errado");
                    break;
            }

            System.out.println(dia+" de "+ mesString +" de "+ano);

    }
}
