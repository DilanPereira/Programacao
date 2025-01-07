package Ficha5;

import java.util.Scanner;

public class Ex02 {
    
    static void pedeValorEFazCalculos(Scanner scanner){
        int [ ] numerosInsiridos = new int [10];
        boolean deuZero = false;
        int soma = 0;
        double media = 0;
        int i = 0;


        for(i = 0; i < numerosInsiridos.length; i++){

            System.out.println("Insira o "+(i+1)+"º numero:");
            numerosInsiridos[i] = scanner.nextInt();

            deuZero = numerosInsiridos[i] == 0 ? true : false;
            if(deuZero==false){}else{
                
                break;}
        }

        for(int j = 0; j<10; j++){
            soma = numerosInsiridos[j] + soma;
        }

        media = 1.0 * soma / i;

        System.out.println("A soma é "+soma+" e a media é "+media);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pedeValorEFazCalculos(scanner);
        scanner.close();
    }
}
