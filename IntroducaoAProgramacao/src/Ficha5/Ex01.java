package Ficha5;

import java.util.Scanner;

public class Ex01 {

    static int[] pedeNumeros(){
        Scanner teclado = new Scanner(System.in);

        int [ ] numerosInsiridos = new int [10];


        for(int i = 0; i<10 ; i++){
            System.out.println("Insira o "+(i+1)+"º numero:");
            numerosInsiridos[i] = teclado.nextInt();
        }

        teclado.close();
        
        return numerosInsiridos;

    }

    static int soma(int num[]){

        int soma = 0;

        for(int i = 0; i<10; i++){
            soma = num[i] + soma;
        }

        return soma;
    }

    static double media(int num[], int soma){
        double media = 0;
        media = 1.0 * soma / num.length;
        return media;
    }


    public static void main(String[] args) {

        int numerosPedidos[] = pedeNumeros();
        int soma = soma(numerosPedidos);
        double media = media(numerosPedidos, soma(numerosPedidos));

        System.out.print("A soma dos numeros é "+soma+" e a média é "+media);

    }
}
