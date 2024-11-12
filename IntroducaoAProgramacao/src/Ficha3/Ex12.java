package Ficha3;
import java.util.Scanner;
public class Ex12 {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um caracter:");
        char caracter = scanner.next().charAt(0);
        scanner.close();
        if (caracter>=65 && caracter<=90 || caracter>=97 && caracter<=122){
            if (caracter>=65 && caracter<=90){
                int valor = (int)caracter + 32;
                System.out.println((char)valor);
            } else if (caracter>=97 && caracter<=122){
                int valor = (int)caracter - 32;
                System.out.println((char)valor);
            }
        } else {
            System.out.println("Não é uma letra");
        }

    }
}
