package Ficha4;

import java.util.Scanner;

public class Ex04 {
    
    static void Fibonacci(int lim){
        int fib = 0;
        int fn1 = 1;
        int fn2 = 0;
        while (fib <= lim){
            fib = fn1 + fn2;
            fn2 = fn1;
            fn1 = fib;
            System.out.println(fib);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um limite");
        int limite = scanner.nextInt();
        scanner.close();

        Fibonacci(limite);
    }
}
