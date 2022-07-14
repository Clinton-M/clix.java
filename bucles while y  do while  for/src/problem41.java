import java.util.Scanner;

public class problem41 {
    //Obtener la suma de los primeros N números naturales positivos.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, n,s=0;

        System.out.println("numero:");
        n= entrada.nextInt();

        //proceso

        i=1;
        while (i<=n){
            s+=i; //=s = s+ i,
            i+=1; //= i=i+i;

        }

        System.out.println("suma:" + s);
    }
}
