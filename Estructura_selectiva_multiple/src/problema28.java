import java.util.Scanner;

public class problema28 {
    public static void main(String[] args) {
        //Enunciado: Dados dos números enteros y un operador (+, ·, • y /), devolver la operación de los dos
        //números según el operador ingresado. Considere que si el segundo número es cero y el operador es<</>>,
        //no es divisible con el primer número, entonces devolver como resultado <<O>> .

        Scanner entrada = new Scanner(System.in);

        System.out.println("primer valor");
        int val1= entrada.nextInt();
        System.out.println("segundo valor");
        int val2= entrada.nextInt();
        System.out.println("ingrese el operador");
        char op= entrada.next().charAt(0);
        int result = 0;

        if (op=='+'){
            result = val1+val2;
        }else if (op=='-'){
            result=val1-val2;
        }else if (op=='*'){
            result=val1*val2;
        }else if (op=='/'){
            if (val2!=0){
                result=val1/val2;
            }//else{
            //r=0;
            //{
        }
        System.out.println("resulado: " + result);

    }
}
