import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        // Crear un programa que al ingresar tres números enteros devuelva
        //los números ordenados en
        //forma ascendente y en forma descendente.
        Scanner entrada =new Scanner(System.in);
        int n1, n2,n3, mayor, medio,menor;
        System.out.println("primer valor");
        n1= entrada.nextInt();
        System.out.println("segundo valor");
        n2= entrada.nextInt();
        System.out.println("tercer valor");
        n3= entrada.nextInt();

        if (n1>n2 && n1>n3){
            mayor=n1;
        }else {
            if (n2>n1 && n2>n3){
                mayor=n2;
            }else {
                mayor=n3;
            }
        }
        if (n1<n2 && n1<n3){
            menor=n1;
        }else {
            if (n2<n1 && n2<n3){
                menor=n2;
            }else {
                menor=n3;
            }
        }
        medio =(n1+n2+n3)-(mayor+menor);
        System.out.println("ascendente:" + mayor + medio + menor );

        System.out.println("");
        System.out.println("descendente:" + menor + medio + mayor );

    }
}
