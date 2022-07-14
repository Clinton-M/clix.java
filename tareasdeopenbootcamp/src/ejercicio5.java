import java.util.Scanner;

public class ejercicio5 {
    //Por último, para el Switch, deberás crear la variable estacion, y distintos case para
    // las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar
    // un mensaje por consola informando de la estación en la que está. También habrá
    // que poner un default para cuando el valor de la variable no sea una estación.
    //primavera, verano, otoño e invierno.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese numero de la estacion");
        int estacion = entrada.nextInt();

        switch (estacion){
            case 1:
                System.out.println("PRIMAVERA");break;
            case 2:
                System.out.println("VERANO");break;
            case 3:
                System.out.println("OTOÑO");break;
            case 4:
                System.out.println("INVIERNO");break;
            default:
                System.out.println("unmero no valido");
        }
    }
}
