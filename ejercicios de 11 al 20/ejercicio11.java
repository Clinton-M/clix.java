import java.util.Scanner;

public class ejercicio11 {

        public static void main(String[] args) {
            //Enunciado: Dada la edad de una persona, determinar si es mayor o menor de edad. Considere que se
            //considera a alguien como mayor de edad si tiene 18 años o más.
            Scanner enrtrada= new Scanner(System.in);
            System.out.println("ingrese su edad:");
            int n= enrtrada.nextInt();
            String r="";

            if (n>0){
                if (n < 18) {
                    r="MENOR DE EDAD";
                }else {
                    r="MAYOR DE EDAD";
                }
            }else {
                r="ingrese otro valor";
            }
            System.out.println("resulta es: " + r);

        }
}
