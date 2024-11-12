package Ficha3;

public class Ex13 {

    public static void main(String[] args) {
        int valor = (int)Math.floor(Math.random() * 8)+1;
        if (valor<=5){
            System.out.println(valor);
        } else {
            System.out.println(6);
        }
    }
}
