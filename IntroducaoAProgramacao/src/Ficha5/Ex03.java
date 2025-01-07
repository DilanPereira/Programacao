package Ficha5;

import java.util.Scanner;

public class Ex03 {

    static void verificaValor(){
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Insira um valor:");
        Scanner teclado = new Scanner(System.in);
            int valor = teclado.nextInt();
        teclado.close();

        for(int i = 0; i<array.length; i++){
            if(array[i] == valor){
                System.out.println("Está no array");
                break;
            }else{
                System.out.println("Não está no array");
            };
        }

    }

    public static void main(String[] args) {
        verificaValor();
    }
}
