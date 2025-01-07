package Ficha7;

public class Ex01 {

    static void imprimeArray(int a[], int inicio, int fim){
        if(a.length>0){
            System.out.print("[");
            if (inicio<fim){
                for(int i = inicio; i < fim; i++){
                    System.out.print(a[i]+", ");
                }
                System.out.print(a[fim]+"]\n");
            } else {
                for(int i = inicio; i > fim; i--){
                    System.out.print(a[i]+", ");
                }
                System.out.print(a[fim]+"]\n");
            }
        }
    }

    static void imprimeArraySeguro(int a[], int inicio, int fim){
        if(a.length>0){
            if(inicio<0){inicio=0;}
            if(fim>a.length-1){fim=a.length-1;}

            System.out.print("[");
            if (inicio<fim){
                for(int i = inicio; i < fim; i++){
                    System.out.print(a[i]+", ");
                }
                System.out.print(a[fim]+"]\n");
            } else {
                for(int i = inicio; i > fim; i--){
                    System.out.print(a[i]+", ");
                }
                System.out.print(a[fim]+"]\n");
            }
        }
    }

    static void imprimeArrayAte(int a[], int fim){
        imprimeArraySeguro(a, 0, fim);
    }

    static void imprimeArrayDepois(int a[], int inicio){
        imprimeArraySeguro(a, inicio, a.length);
    }

    static void imprimeArrayInverso(int a[]){
        imprimeArraySeguro(a, a.length-1, 0);
    }

    static void  imprimeArrayEmFatias(int a[], int n){
        for(int i = 0; i<a.length; i += n){
            imprimeArraySeguro(a, i, i + n - 1);
        }
    }

    public static void main(String[] args) {
        int [] array = {0,1,2,3,4,5,6,7,8,9};
        int inicio = 2;
        int fim = 8;
        int fatias = 3;

        System.out.println("imprimeArray:");
        imprimeArray(array, inicio, fim);

        System.out.println("imprimeArraySeguro:");
        imprimeArraySeguro(array, inicio, fim);

        System.out.println("imprimeArrayAte:");
        imprimeArrayAte(array, fim);

        System.out.println("imprimeArrayDepois:");
        imprimeArrayDepois(array, inicio);

        System.out.println("imprimeArrayInverso:");
        imprimeArrayInverso(array);

        System.out.println("imprimeArrayEmFatias:");
        imprimeArrayEmFatias(array, fatias);
    }
}
