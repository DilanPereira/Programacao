package Ficha3;

public class Ex05 {

    static void caraCoroa(){
        if(Math.random() > 0.5){
            System.out.println("Cara");
        } else {
            System.out.println("Coroa");
        }
    }

    public static void main(String[] args) {
        caraCoroa();
    }
}
