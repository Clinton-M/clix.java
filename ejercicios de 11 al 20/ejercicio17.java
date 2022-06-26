import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {

        //Enunciado: Dados los siguientes datos de entrada: saldo anterior, tipo de movimiento «R» (retiro) o «D»
        //(deposito) y monto de la transacción, obtener como dato de salida el saldo actual.
        //entrada
        int SA, M;
        char TM = 0; // (R) ||(D)
        //salida
        int S_AC;

        Scanner entrada =new Scanner(System.in);
        System.out.println("ingrese el saldo ");
        SA= entrada.nextInt();
        System.out.println("ingrese el ripo de movimiento");
        S_AC= entrada.next().charAt(0);
        System.out.println("ingrese el monto");
        M=entrada.nextInt();

        if (TM == 'R' || TM == 'r'){
            S_AC=SA-M;
        }else {
            if (TM == 'D' || M == 'd'){
                S_AC=SA+M;
            }
        }
        System.out.println("Saldo actual es: " + S_AC);
    }
}
