package Ficha21;

public interface Ex04 {
    public static void main( String [] args){
        float pesoKg = 65.5f;
        float alturaMetros = 1.75f;

        float imc= pesoKg / (alturaMetros * alturaMetros);
        System.out.println("O seu IMC é: "+imc);
    }
}
