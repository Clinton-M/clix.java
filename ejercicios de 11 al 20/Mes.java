import java.util.Calendar;
import java.util.Scanner;


public class Mes {
    public static void main(String[] args) {
        Scanner entradsa =new Scanner(System.in);
        System.out.println("ingrese el numero del mes");
        int mes= entradsa.nextInt();

        switch (mes){
            case 1:
                System.out.println("enero");
                break;

            case 2:
                System.out.println("febrero");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
                System.out.println("mes no valido");
        }
    }
}
