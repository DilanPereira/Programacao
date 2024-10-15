package Ficha21;

public class Ex07 {
    public static void main( String [] args){
    
        float preco= 2.99f;
        byte descontoPercentagem= 20;

        float novoPreco= preco*(100-20)/100;

        System.out.println("O preço "+preco+" com "+descontoPercentagem+"% é "+novoPreco);
    }
}
