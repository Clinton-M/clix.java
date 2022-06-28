public class ejercicio1 {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.AumentarPuertas();

        System.out.println(miCoche.Puertas);
    }
}
    class  coche {
        public int Puertas = 0;

        public void AumentarPuertas() {
            this.Puertas++;
        }

    }

