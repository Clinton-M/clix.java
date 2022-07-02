public class potato {
    public static void main(String[] args) {
        potatoo miPotato =new  potatoo();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos);
    }

//    public static int suma(int a, int b;) {
//       return a+b;
//    }
}

    class potatoo{
        public int brazos=0;

        public void QuitarBrazo(){
            this.brazos--;
        }
    }

