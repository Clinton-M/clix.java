import java.util.Scanner;

public class problema29 {
    public static void main(String[] args) {
//Enunciado: Dada una letra, determinar si es una vocal.

        Scanner entrada = new Scanner(System.in);
        System.out.println("letra:");
        char v=entrada.next().charAt(0);

        if (v=='a' || v=='A'||
            v=='e' || v=='E'||
            v=='i' || v=='I'||
            v=='o' || v=='O'||
            v=='u' || v=='U'
        ){
            System.out.println("es vocal");
        }else {
            System.out.println("no es vocal");
        }
    }
}
