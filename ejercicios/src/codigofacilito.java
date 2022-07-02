public class codigofacilito {
    public static void main(String[] args) {
        String mensaje ="Hola, soy un String";

        int cantidad = mensaje.length();
        boolean contiene=mensaje.contains("Hola");

        boolean iniciaCon = mensaje.startsWith("Hola");
        boolean terminaCon =mensaje.endsWith("String");


        String mesaje3 = mensaje.concat(", estamos en el curso de java");


        System.out.println(cantidad);
        System.out.println(contiene);
        System.out.println(iniciaCon);
        System.out.println(terminaCon);
        System.out.println(mesaje3);


    }
}
