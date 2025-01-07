package Ficha5;

public class Ex06 {

    static void array(){
        int [] notas = new int[20];
        
        for(int i = 0; i<notas.length; i++){
            int numeroAleatorio = (int)(Math.random()*200 + 1);

            notas[i] = numeroAleatorio;
        }
        
        int maior = maior(notas);
        int menor = menor(notas);
        int notasPositivas = positivas(notas);
        int notasNegativas = notas.length - positivas(notas);

        System.out.println("A maior nota foi: "+maior/10.0);
        System.out.println("A menor nota foi: "+menor/10.0);
        System.out.println("Houve "+notasPositivas+" positivas e "+notasNegativas+" negativas");

    }

    static int maior(int [] notas){
        int maior = 0;
        for(int i = 0; i<notas.length; i++){
            maior = (maior < notas[i]) ? (maior=notas[i]) : maior;
        }
        return maior;

    }

    static int menor(int [] notas){
        int menor = 200;
        for(int i = 0; i<notas.length; i++){
            menor = (menor < notas[i]) ? menor : (menor=notas[i]);
        }
        return menor;

    }

    static int positivas(int [] notas){

        int notasPositivas = 0;

        for(int i = 0; i<notas.length; i++){
            if(notas[i]>95){
                notasPositivas = notasPositivas + 1;
            } else {}
        }

        return notasPositivas;

    }

        //System.out.println("A maior nota foi: "+maior/10.0);
        //System.out.println("A menor nota foi: "+menor/10.0);
        //System.out.println("Houve "+notasPositivas+" positivas");
        //System.out.println("Houve "+notasNegativas+" negativas");
    
    public static void main(String[] args) {
        array();
    }
}
