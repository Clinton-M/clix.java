import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        //Enunciado: Dados dos números enteros, devolver el número menor.

        Scanner entrada =new Scanner(System.in);
        System.out.println("primer valor:");
        int val1= entrada.nextInt();
        System.out.println("segundo valor:");
        int val2= entrada.nextInt();

        if (val1>val2 ){
            System.out.println("el mayor es: " + val1);
        }else if (val2>val1){
            System.out.println("el mayor es: " + val2);
        }

    }
}
