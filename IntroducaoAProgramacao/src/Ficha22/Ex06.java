package Ficha22;

import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randDado = rand.nextInt(6) + 1;
        System.out.println(randDado);
    }
}
