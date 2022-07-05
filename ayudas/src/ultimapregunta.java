import java.util.Scanner;

public class ultimapregunta {
    //Dada una fecha determine cuántos días faltan para que acabe el año (CODIGO FUENTE)
    public static void main(String[] args) {
        Scanner pro1=new Scanner(System.in);
        int x=0,d=0;

        System.out.print("Ingresa el dia XX:\n");
        int dia=pro1.nextInt();
        System.out.print("Ingresa el mes XX:\n");
        int mes=pro1.nextInt();
        System.out.print("Ingresa el año XXXX:\n");
        int año=pro1.nextInt();
        //Para saber si el año es bisiesto o no
        if((año%4==0)&&!(año%100==0&&año%400!=0)) {
            x=29;
        }
        else {
            x=28;
        }
        //Saber cuanto transcurre por mes
        switch(mes) {
            case 1->d=0;
            case 2->d=31;
            case 3->d=31+x;
            case 4->d=31+x+31;
            case 5->d=31+x+31+30;
            case 6->d=31+x+31+30+31;
            case 7->d=31+x+31+30+31+30;
            case 8->d=31+x+31+30+31+30+31;
            case 9->d=31+x+31+30+31+30+31+31;
            case 10->d=31+x+31+30+31+30+31+31+30;
            case 11->d=31+x+31+30+31+30+31+31+30+31;
            case 12->d=31+x+31+30+31+30+31+31+30+31+30;
        }
        //Calcular cuantos dias faltan
        int falta=((337+x)-(dia+d));
        System.out.println("La fecha ingresada es: "+dia+"/"+mes+"/"+año);
        System.out.println("Falta "+falta+" para que acabe el año");
    }
}
