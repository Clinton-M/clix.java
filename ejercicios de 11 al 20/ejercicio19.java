import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        //Dadas tres longitudes, diga si forman un triángulo.
        Scanner entrada =new Scanner(System.in);
        int a,b,c;

        System.out.println("lado 1");
        a=entrada.nextInt();
        System.out.println("lado 2");
        b=entrada.nextInt();
        System.out.println("lado 3");
        c=entrada.nextInt();
        //di dea correr ponga en comentario el if que esta en uso
        //if (a<b+c & c<a+b & b<a+c &&
        // a>b-c & c>a-b & b>a-c &&
        //a>c-b & c>b-a & b>c-a){
        if (a<b+c& b<a+c& c<b+a& a>b-c & b>a-c & c>b-a & a>c-b & b>c-a & c>a-b){

            System.out.println("ES TRIANGULO");
        }else {
            System.out.println("NO ES TRIANGULO");
        }


    }
}
