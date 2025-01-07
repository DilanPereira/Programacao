package Ficha4;

public class Ex11 {

    public static void charAleatorio(){
        char character = 0;
        do{
            System.out.println(character);
            character = (char)((int)(Math.random()*26) + 'a');
            System.out.println(character);
        } while (character != 'z');
    }

    public static void main(String[] args) {
        charAleatorio();
    }
}
