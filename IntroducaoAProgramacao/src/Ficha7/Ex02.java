package Ficha7;

import java.util.Scanner;

public class Ex02 {

    static int lerInt(Scanner scanner){
        System.out.println("Insira um numero:");

        while(!scanner.hasNextInt()){
            scanner.nextLine();
        }
        int num = scanner.nextInt();
        
        return num;
    }

    static int lerInt(Scanner scanner, int min, int max){
        int num = 0;
        boolean valorCerto = false;

        do{
            num = lerInt(scanner);
            if(num>=min && num<=max){
                valorCerto = true;
                return num;
            } else {
                valorCerto = false;
                System.out.println("\nValor fora do intervalo. Tente novamente.");
            }
        }while(!valorCerto);
        
        return num;
    }

    static int lerInt(Scanner scanner, int max){
        int min = 0;
        
        int resultado = lerInt(scanner, min, max);

        return resultado;
    }

    static int lerInt(Scanner scanner, int min, int max, String msg){
        
        int resultado = lerInt(scanner, min, max);

        System.out.println(msg);
        return resultado;
    }

    static int[] lerArray(Scanner scanner, int tamanho, int min, int max){
        
        int[] array = new int[tamanho];
        String msg = "";

        for(int i = 0; i<tamanho; i++){
            msg = "Valor introduzido na posição ["+i+"]";
            array[i] = lerInt(scanner, min, max, msg);
        }

        return array;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int min = 1;
        int max = 5;
        String msg = "";
        int tamanho = 5;
        int opcao = 0;

        System.out.println("1 - lerInt(scanner)\n"+
                           "2 - lerInt(scanner, min, max)\n"+
                           "3 - lerInt(scanner, max)\n"+
                           "4 - lerInt(scanner, min, max, msg)\n"+
                           "5 - lerArray(scanner, tamanho, min, max)"
        );

        while(!scanner.hasNextInt()){
            scanner.nextLine();
        }
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                lerInt(scanner);
                break;
            case 2:
                lerInt(scanner, min, max);
                break;
            case 3:
                lerInt(scanner, max);
                break;
            case 4:
                lerInt(scanner, min, max, msg);
                break;
            case 5:
                lerArray(scanner, tamanho, min, max);
                break;
        
            default:
                break;
        }

        scanner.close();

    }
}
