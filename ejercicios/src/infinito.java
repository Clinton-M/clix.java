public class infinito {
    public static void main(String[] args) {
        suma(1,2);
    }

    public static int suma( int a ,int b) {
        int resultado = a+b;
        System.out.println(resultado);
        return suma(a,resultado);

    }
}
