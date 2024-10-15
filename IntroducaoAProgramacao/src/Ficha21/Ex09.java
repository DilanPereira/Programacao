package Ficha21;

public class Ex09 {
    public static void main( String [] args){
    
        byte horas= 5;
        byte minutos= 37;
        byte segundos= 45;

        int horasEmSegundos= horas * 3600 + minutos*60 + segundos;

        System.out.println(horas+" horas, "+minutos+" minutos e "+segundos+" segundos é equivalente a "+horasEmSegundos+" segundos.");
    }
}
