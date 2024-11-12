package Ficha4;

public class Ex09 {

    static void LancamentoDados(){
        int dado1 = 0;
        int dado2 = 0;
        
        while(dado1+dado2 != 12){
            dado1 = (int)(Math.random() * 6 + 1);
            dado2 = (int)(Math.random() * 6 + 1);
            System.out.println(dado1 +" + "+ dado2);
        }
    }

    public static void main(String[] args) {
        LancamentoDados();
    }
}
