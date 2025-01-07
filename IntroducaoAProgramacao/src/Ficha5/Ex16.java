package Ficha5;

import java.util.Scanner;

public class Ex16 {

    static void menu(int [] plateiaUm, int [] plateiaDois, int [] balcao, int [] camarote){

        System.out.printf("\nBilhetes para o Concerto:"+
                          "\n%-20s %3d Bilhetes Disponiveis %3d Bilhetes Selecionados"+ 
                          "\n%-20s %3d Bilhetes Disponiveis %3d Bilhetes Selecionados"+
                          "\n%-20s %3d Bilhetes Disponiveis %3d Bilhetes Selecionados"+
                          "\n%-20s %3d Bilhetes Disponiveis %3d Bilhetes Selecionados%n%n"
        
                , "(1)º Plateia", plateiaUm[1], plateiaUm[2]
                         ,"(2)º Plateia", plateiaDois[1], plateiaDois[2]
                         ,"(B)alcão", balcao[1], balcao[2]
                         ,"(C)amarote", camarote[1], camarote[2]);

        System.out.println("Preço: "+ (preco(plateiaUm)+preco(plateiaDois)+preco(balcao)+preco(camarote))+"\n");
    }

    static int preco(int [] array){
        int preco = array[0];
        int bilhetesComprados = array[2];

        int valor = preco * bilhetesComprados;

        return valor;
    }

    static void comprarBilhetes(int [] array, Scanner scanner){
        int bilhetes = array[1];
        int bilhetesComprados = array[2];

        System.out.println("Quantos bilhetes quer comprar?");
        int bilhetesParaComprar = scanner.nextInt();

        if(bilhetesParaComprar>0 && bilhetesParaComprar<=bilhetes){
            bilhetesComprados = bilhetesComprados + bilhetesParaComprar;
            bilhetes = bilhetes - bilhetesParaComprar;
        } else {
            if(bilhetesParaComprar<0){System.out.println("Valor invalido");}
            else if(bilhetesParaComprar>bilhetes){System.out.println("Não existe essa quantidade bilhetes disponiveis");}
        }
        
        array[1] = bilhetes;
        array[2] = bilhetesComprados;
    }

    static void desenharOpcao(int [] array, String opcao){
        System.out.printf("%n|----------------------|--------------------------|---------------------------|%n"+
                          "| %-20s | %3d Bilhetes Disponiveis | %3d Bilhetes Selecionados |%n"+
                          "|----------------------|--------------------------|---------------------------|%n%n"
                            
                          , opcao, array[1], array[2]);
    }

    static void selecionarMenu(int [] plateiaUm, int [] plateiaDois, int [] balcao, int [] camarote, Scanner scanner){
        boolean sair = false;
        do{
            menu(plateiaUm, plateiaDois, balcao, camarote);
            System.out.println("Escolhe a opção:");
            char opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    desenharOpcao(plateiaUm , "1ºPlateia");
                    comprarBilhetes(plateiaUm, scanner);
                    break;

                case '2':
                    desenharOpcao(plateiaDois , "2ºPlateia");
                    comprarBilhetes(plateiaDois, scanner);
                    break;

                case 'b':
                case 'B':
                    desenharOpcao(balcao , "Balcão");
                    comprarBilhetes(balcao, scanner);
                    break;
            
                case 'c':
                case 'C':
                    desenharOpcao(camarote , "Camarote");
                    comprarBilhetes(camarote, scanner);
                    break;

                case '0':
                    sair = true;
                    break;

                default:
                    System.out.println("Caracter incorreto, volte a inserir:");
                    break;
            }

        }while(sair != true);
    }



    public static void main(String[] args) {
        int [] plateiaUm = {50, 200, 0};
        int [] plateiaDois = {40, 100, 0};
        int [] balcao = {60, 100, 0};
        int [] camarote = {90, 10, 0};

        Scanner scanner = new Scanner(System.in);

        selecionarMenu(plateiaUm, plateiaDois, balcao, camarote, scanner);
        
        scanner.close();
    }
}
