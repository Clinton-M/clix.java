import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        //Enunciado: Dados dos números enteros «a» y «b», determinar cuál es mayor con respecto al otro.
        //a es mayor que b
        //b es mayor que a
        //a es igual a b
        Scanner entrada =new Scanner(System.in);
        int a, b;
        String SALIDA ="";
        System.out.println("valor a");
        a= entrada.nextInt();
        System.out.println("valor b");
        b= entrada.nextInt();
        if (a<b){
            SALIDA="'a' es mayo que 'b'";
        }else {
            if (b<a){
                SALIDA="'b' es mayor que 'b'";
            }
            if (a==b){
                SALIDA="'a' es igual a 'b'";
            }
            System.out.println("resultado es: " + SALIDA);
        }
    }
}
