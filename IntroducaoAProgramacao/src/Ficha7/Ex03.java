package Ficha7;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Acedeu "+menuPrincipal(scanner)+" funcionalidades");
        scanner.close();
        
    }

    static int menuPrincipal(Scanner scanner){
        int opcao = -1;
        boolean pedeSair = false;
        int funcionalidadesAcessadas = 0;
        int valorFuncMenu1 = 0;
        int valorFuncMenu2 = 0;


        do{
            System.out.println("Menu:\n"+
                               "1 - subMenu1\n"+
                               "2 - subMenu2\n"+
                               "0 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    valorFuncMenu1 = valorFuncMenu1 + subMenu1(scanner);
                    break;
                case 2:
                    valorFuncMenu2 = valorFuncMenu2 + subMenu2(scanner);
                    break;
                case 0:
                    pedeSair = true;
                    break;
            
                default:
                    break;
            }
        }while(!pedeSair);

        funcionalidadesAcessadas = valorFuncMenu1 + valorFuncMenu2;

        return funcionalidadesAcessadas;
    }

    static int subMenu1(Scanner scanner){
        int opcao = -1;
        boolean pedeSair = false;
        int opcaoA = 0;
        int opcaoB = 0;
        int opcaoC = 0;

        do{
            System.out.println("Menu:\n"+
                               "1 - A\n"+
                               "2 - B\n"+
                               "3 - C\n"+
                               "0 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("A");
                    opcaoA = opcaoA + 1;
                    break;
                case 2:
                    System.out.println("B");
                    opcaoB = opcaoB + 1;
                    break;
                case 3:
                    System.out.println("C");
                    opcaoC = opcaoC + 1;
                    break;
                case 0:
                    pedeSair = true;
                    break;
            
                default:
                    break;
            }
        }while(!pedeSair);

        return (opcaoA + opcaoB + opcaoC);
    }

    static int subMenu2(Scanner scanner){
        int opcao = -1;
        boolean pedeSair = false;
        int opcaoD = 0;
        int opcaoE = 0;
        int opcaoF = 0;

        do{
            System.out.println("Menu:\n"+
                               "1 - D\n"+
                               "2 - E\n"+
                               "3 - F\n"+
                               "0 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("D");
                    opcaoD = opcaoD + 1;
                    break;
                case 2:
                    System.out.println("E");
                    opcaoE = opcaoE + 1;
                    break;
                case 3:
                    System.out.println("F");
                    opcaoF = opcaoF + 1;
                    break;
                case 0:
                    pedeSair = true;
                    break;
            
                default:
                    break;
            }
        }while(!pedeSair);

        return (opcaoD + opcaoE + opcaoF);
    }
}
