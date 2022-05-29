import java.util.Scanner;

public class EjercicioDoWhile01 {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int forma_de_pago, i, n, tipodehamburguesa;
        double cargo, costo, pago;
        pago = 0;
        System.out.print("Ingresa el valor de n: ");
        n = lt.nextInt();
        lt.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " +  i);
            System.out.println("Selecciona el valor de tipo de hamburguesa.");
            System.out.println("------------------------------------------------");
            System.out.println("1.Hamburguesa S sencilla: ");
            System.out.println("------------------------------------------------");
            System.out.println("2.Hamburguesa D doble: ");
            System.out.println("------------------------------------------------");
            System.out.println("3.Hamburguesa T triples: ");
            System.out.print("\t: ");
            do {
                tipodehamburguesa = lt.nextInt();
                lt.nextLine();
                if (tipodehamburguesa<1||tipodehamburguesa>3)
                    System.out.print("Valor incorrecto. Ingrese una opcion nuevamente.: ");
            } while (tipodehamburguesa<1||tipodehamburguesa>3);
            costo=0;
            if(tipodehamburguesa==1)
                costo=10;
            if(tipodehamburguesa==2)
                costo=12;
            if(tipodehamburguesa==3)
                costo=14;
            System.out.println("Selecciona el valor de forma de pago.");
            System.out.println("--------------------------------------");
            System.out.println("1. Efectivo");
            System.out.println("--------------------------------------");
            System.out.println("2. Tarjeta");
            do {
                forma_de_pago = lt.nextInt();
                lt.nextLine();
                if (forma_de_pago<1||forma_de_pago>2)
                    System.out.print("Valor incorrecto. Ingrese opcion nuevamente.: ");
            } while (forma_de_pago<1||forma_de_pago>2);
            if(forma_de_pago==1)
                cargo=0;
            else
                cargo=costo*0.05/100;
            pago=pago+costo+cargo;
            System.out.println("Valor de cargo: " + cargo);
            System.out.println("Valor de costo: " + costo);
            System.out.println();
        }
        System.out.println("Valor de pago: " + pago);
    }

}