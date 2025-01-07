package Ficha5;

import java.util.Scanner;

public class Ex04 {
    
    static void verificaValor(){
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Insira um valor:");
        Scanner teclado = new Scanner(System.in);
            int valor = teclado.nextInt();
        teclado.close();

        int quantVarMaior = 0;

        for(int i = 0; i<array.length; i++){
            if(array[i] > valor){
                quantVarMaior = quantVarMaior + 1;
            }else{};
        }

        System.out.println("Existem "+quantVarMaior+" numeros maiores que o insirido");

    }

    public static void main(String[] args) {
        verificaValor();
    }
}
