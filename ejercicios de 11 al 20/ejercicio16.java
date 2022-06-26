import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        //Enunciado: Después de ingresar 4 notas, obtener el
        // promedio de la tres mejores. Mostrar el mensaje
        //«Aprobado>> si el promedio es mayor o igual a 11; caso contrario, mostrar «Desaprobado».

        Scanner entrada =new Scanner(System.in);

        System.out.println("nota 1");
        int a= entrada.nextInt();
        System.out.println("nota 2");
        int b= entrada.nextInt();
        System.out.println("inota 3");
        int c= entrada.nextInt();
        System.out.println(" nota 4");
        int d=entrada.nextInt();
        int promedio;
        if (a<=b && a<=c && a<=d){
            promedio=(b+c+d)/3;
        }else {
            if (b<=a && b<=c && b<=d){
                promedio=(a+c+d)/3;
            }else {
                if (c<=a && c<=b && c<=d){
                    promedio=(a+b+d)/3;
                }else {
                    promedio=(a+b+c)/3;
                }
            }
        }
        if (promedio>=11){
            System.out.println("APROBADO");
        }else {
            System.out.println("DESAPROBADO");
        }

    }
}
