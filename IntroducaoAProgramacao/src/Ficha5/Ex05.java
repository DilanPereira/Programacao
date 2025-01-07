package Ficha5;

public class Ex05 {

    static void verificaValor(){
        boolean [] array = {true,false,false,true,false,true,true,true,false,true};

        int quantVarTrue = 0;

        for(int i = 0; i<array.length; i++){
            if(array[i] == true){
                quantVarTrue = quantVarTrue + 1;
            }else{};
        }

        System.out.println("Existem "+quantVarTrue+" trues e "+(array.length-quantVarTrue)+" falses");

    }

    public static void main(String[] args) {
        verificaValor();
    }
}
