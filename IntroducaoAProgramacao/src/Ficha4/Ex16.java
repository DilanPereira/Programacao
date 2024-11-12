package Ficha4;

public class Ex16 {

    static void maxDezNum(){
        int valorMaximo = 0;
        for(int i = 0; i<10 ; i++){
            int valorAleatorio = (int)(Math.random() * 100 + 1);
            // System.out.println(valorAleatorio); //Verificar numeros aleatorios
            if (valorMaximo < valorAleatorio){valorMaximo = valorAleatorio;}
        }
        System.out.println("O valor maximo é "+valorMaximo);

    }

    public static void main(String[] args) {
        maxDezNum();
    }
}
