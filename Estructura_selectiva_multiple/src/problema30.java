import java.util.Scanner;

public class problema30 {
    public static void main(String[] args) {
        //123:verano;456:otoño;789:invierno;10 11 12:primavera;

        Scanner entrada = new Scanner(System.in);
        System.out.println("mes:");
        int m=entrada.nextInt();

        switch (m){
            case 1:
            case 2:
            case 3:
                System.out.println("VERANO");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("OTOÑO");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("INVIERNO");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("PRIMAVERA");
            default:
                System.out.println("mes no valido");
        }
    }
}
