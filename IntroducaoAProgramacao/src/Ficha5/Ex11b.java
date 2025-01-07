package Ficha5;

public class Ex11b {
    public static void main(String[] args) {
        int [] array = {1,2,3,5,6,7,8};
        int valorAAdicionar = 2;
        int posicaoParaValor = -1;

        for(int i = 0; i < array.length; i++){
            if(valorAAdicionar > array[i]){
                posicaoParaValor = i + 1;
            }
        }

        int [] arrayNovo = new int[array.length+1];

         for(int i = 0; i<array.length+1; i++){
            if(i < posicaoParaValor){
                arrayNovo[i] = array[i];
            }else if(i == posicaoParaValor){
                arrayNovo[i] = valorAAdicionar;
            } else if(i > posicaoParaValor){
                arrayNovo[i] = array[i-1];
            }
        }

        array = arrayNovo;

        for(int i = 0; i<array.length; i++){
            System.out.println("Posição "+(i+1)+" = "+array[i]);
        }

    }
}
