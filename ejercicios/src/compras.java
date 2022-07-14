import java.util.*;
public class compras {
    Scanner dato = new Scanner(System.in);
    public void compraproducto(){
        String nproducto ="";
        double precio, totalc;
        double tp =0;
        int cantidad;
        System.out.println(" nombre del producto");
        nproducto= dato.next();
        System.out.println(" precio del producto");
        precio = dato.nextDouble();
        System.out.println("Ingreso la cantidad");
        cantidad =dato.nextInt();
        totalc = precio * cantidad;
        System.out.println("El total es : "+totalc);
        if(totalc > 500){
            System.out.println("El descuento es ; "+totalc*0.30);
            tp = totalc - (totalc*0.30);
            System.out.println("pagar: "+tp);
        }else{
            System.out.println("No hay descuentos");
        }
    }
    public void seccion ( ) {
        String cliente;
        System.out.println("Ingreso el nombre del cliente");
        cliente = dato.next();
        System.out.println("Ingrese el nombre de la sección de productos");  String opcion ="";
        opcion = dato.next();
        switch(opcion) {
            case "frutas":  compraproducto();  break;
            case "verduras":  compraproducto();  break;
            case "abarrotes":  compraproducto();  break;
        }
    }
    public static void main (String []args){
        compras cp = new compras();
        cp.seccion();
    }
}