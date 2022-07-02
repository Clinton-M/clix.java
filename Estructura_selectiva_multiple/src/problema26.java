import java.util.Scanner;

public class problema26 {
    //Enunciado: Al ingresar un número entre 1 y 4 devolver la estación del año de acuerdo a la siguiente tabla.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el numero");
        int n = entrada.nextInt();
        String estaciones ="";

        switch (n){
            case 1:
                estaciones="VERANO";
                break;
            case 2:
                estaciones="OTOÑO";
                break;
            case 3:
                estaciones="INVIERNO";
                break;
            case 4:
                estaciones="PRIMAVERA";
                break;
            default:
                estaciones="solo hay 4 estaciones";
        }
        System.out.println("Es: " +estaciones);

    }
}
