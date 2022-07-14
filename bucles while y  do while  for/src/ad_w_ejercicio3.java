import java.util.Scanner;

public class ad_w_ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escriba un numero positivo:" );
        int numero= entrada.nextInt();

        while (numero < 0){
            System.out.println("ha escrito un numero regativo! intente de nuevo");
            System.out.println("escriba un numero positivo");
            numero=entrada.nextInt();
        }
        System.out.println("gracais por su colaboracion");

    }
}
