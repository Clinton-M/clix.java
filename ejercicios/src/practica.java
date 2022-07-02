import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = entrada.next();


        String nuevoNombre= nombre.concat(", bienvenido al curso de java");
        System.out.println(nuevoNombre);

        int cantidad= nombre.length();
        boolean contienes = nombre.contains("clinton");
        boolean continesInici= nombre.startsWith("C");
        boolean contieneFinal = nombre.endsWith("n");
        System.out.println("tiene: " + cantidad + " caracteres");
        System.out.println(contienes);
        System.out.println(continesInici);
        System.out.println(contieneFinal);
    }
}
