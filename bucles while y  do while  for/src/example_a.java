import java.util.Scanner;

public class example_a {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero =7;
        boolean esPrimo = true;

        for (int i=2; i < numero; i++){
            if (numero % i == 0){
                esPrimo = false;
            }
        }
        if (esPrimo){
            System.out.println("es primo");
        }
        else {
            System.out.println("no es primo");
        }
    }
}
