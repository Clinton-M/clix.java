import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        //Enunciado: Dado un número entero, devolver el doble del número si el número es positivo; el triple del
        //número si es negativo; y cero si el número es neutro.

        Scanner entrada =new Scanner(System.in);
        System.out.println("valor:");
        int num1=entrada.nextInt();
        int r;

        if (num1>0){
            r=num1*2;
            System.out.println("resultado:" + r);
        }else if (num1<0){
            r=num1*3;
            System.out.println("resultado:" + r);
        }else {
            System.out.println("es neutro");
        }
    }
}
