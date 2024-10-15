package Ficha21;

public class Ex11 {
    public static void main( String [] args){
    
        float salario= 930.5f;
        byte carrosVendidos= 7;
        float bonusPorCarroVendido = 5.32f;
        byte comissaoPorCarro=5;
        
        float salarioFinal= salario + carrosVendidos*bonusPorCarroVendido+ carrosVendidos*comissaoPorCarro;

        System.out.println("Ao total o salário foi de: "+salarioFinal);
    }
}
