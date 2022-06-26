import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        //Enunciado: Dadas tres longitudes, si forman un triángulo, devolver el tipo de triángulo según sus lados.
        //T. Equilátero: Sus tres lados son iguales
        //T. Isósceles: Tiene dos lados iguales.
        //T. Escaleno: Sus tres lados son diferentes.
        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        String R = "";
        System.out.println("lado 1");
        a = entrada.nextInt();
        System.out.println("lado 2");
        b = entrada.nextInt();
        System.out.println("lado 3");
        c = entrada.nextInt();

        if (a == b && b == c && a == c) {
            R = "EQUILATERO";
        } else {
            if (a == b && b == a && a != c && b != c && c != a && c != b
                    || a == c && c == a && b != c && c != b && b != a && a != b
                    || b == c && c == b && b != a && a != b && c != a && a != c
            ) {
                R = "ISOSCELES";
            } else {
                if (a != b && b != c && a != c) ;
                R = "ESCALENO";
            }
        }
        System.out.println("El triangulo es: " + R);

    }
}

