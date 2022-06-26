import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        //Enunciado: Dados dos números, determinar si son iguales o son diferentes

        Scanner entrada =new Scanner(System.in);
        System.out.println("primer valor:");
        int n1=entrada.nextInt();

        System.out.println("primer valor:");
        int n2=entrada.nextInt();

        if (n1!=n2){
            System.out.println("son diferentes");
        }else {
            System.out.println("son iguales");
        }
    }
}
