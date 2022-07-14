import java.util.Scanner;

public class ejercicio1 {
    //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el numero:");
        int numero = entrada.nextInt();

        if (numero > 0){
            System.out.println(" es postivo");
        }else if (numero==0){
            System.out.println("es neutro");
        }else {
            System.out.println("es negativo");
        }
    }
}
