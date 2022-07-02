import java.util.Scanner;

public class problema27 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("ingrese el numero");
        int valor= entrada.nextInt();
        String resultado ="";

        switch (valor){
            case 1: resultado="UNO";
            break;
            case 2: resultado="DOS";
            break;
            case 3: resultado="TRES";
            break;
            case 4: resultado="CUATRO";
            break;
            case 5: resultado="CINCO";
            break;
            case 6: resultado="SEIS";
            break;
            case 7: resultado="SIETE";
            break;
            case 8: resultado="OCHO";
            break;
            case 9: resultado ="NUEVE";
            break;
            default: resultado="solo menores a nueve";
        }
        System.out.println(resultado);
    }
}
