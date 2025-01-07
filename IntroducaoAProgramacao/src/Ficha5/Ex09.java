package Ficha5;

public class Ex09 {

    public static double[] array(int num){
        double [] array = new double[num];

        for(int i = 0; i<array.length; i++){
            double numeroAleatorio = (Math.random()*10 + 1);

            array[i] = numeroAleatorio;
        }

        return array;
    }

    public static double soma(double[] arrayUm, double[] arrayDois, int quantValores){

        double soma = 0;
        
        for(int i = 0; i<quantValores; i++){
            soma = soma + (arrayUm[i] * arrayDois[i]);
        }

        return soma;
    }


    public static void main(String[] args) {

        int quantValores = 5;

        double [] arrayUm = array(quantValores);
        double [] arrayDois = array(quantValores);

        double soma = soma(arrayUm, arrayDois, quantValores);

        System.out.println("A soma dos produtos dos arrays é de "+soma);
    }
}
