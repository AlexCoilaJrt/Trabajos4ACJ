import java.util.Scanner;

public class EjercicioDoWhile03ACJ {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int i, n;
        double cantidadenero01, cantidadfebrero02, cantidadmarzo03, cantidadabril04, cantidadmayo05;
        double cantidadjunio06, cantidadjulio07, cantidadagosto08, cantidadseptiembre09, cantidadoctubre10;
        double cantidadnoviembre11, cantidaddiciembre12, intereses, inversion_final, total;
        total = 0;
        System.out.print("Ingresa el valor de n: ");
        n = lt.nextInt();
        lt.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.println("Ingrese el valor de cant Enero 01: ");
            cantidadenero01 = lt.nextDouble();
            lt.nextLine();
            System.out.println("Ingrese el valor de cant Febrero 02: ");
            cantidadfebrero02 = lt.nextDouble();
            lt.nextLine();
            System.out.println("Ingrese el valor de cant Marzo 03: ");
            cantidadmarzo03 = lt.nextDouble();
            lt.nextLine();
            System.out.println("Ingrese el valor de cant Abril 04: ");
            cantidadabril04 = lt.nextDouble();
            lt.nextLine();
            System.out.println("Ingrese el valor de cant Mayo 05: ");
            cantidadmayo05 = lt.nextDouble();
            lt.nextLine();
            System.out.println("Ingrese el valor de cant Junio 06: ");
            cantidadjunio06 = lt.nextDouble();
            lt.nextLine();
            System.out.println("Ingrese el valor de cant Julio 07: ");
            cantidadjulio07 = lt.nextDouble();
            lt.nextLine();
            System.out.println("Ingrese el valor de cant Agosto 08: ");
            cantidadagosto08 = lt.nextDouble();
            lt.nextLine();
            System.out.println("Ingrese el valor de cant Septiembre 09: ");
            cantidadseptiembre09 = lt.nextDouble();
            lt.nextLine();
            System.out.println("Ingrese el valor de cant Octubre 10: ");
            cantidadoctubre10 = lt.nextDouble();
            lt.nextLine();
            System.out.println("Ingrese el valor de cant Noviembre 11: ");
            cantidadnoviembre11 = lt.nextDouble();
            lt.nextLine();
            System.out.println("Ingrese el valor de cant Diciembre 12: ");
            cantidaddiciembre12 = lt.nextDouble();
            lt.nextLine();
            intereses=total*0.1;
            total=total+intereses+cantidadenero01+ cantidadfebrero02+ cantidadmarzo03+ cantidadabril04+ cantidadmayo05+cantidadjunio06+ cantidadjulio07+ cantidadagosto08+ cantidadseptiembre09+ cantidadoctubre10+cantidadnoviembre11+ cantidaddiciembre12;
            inversion_final=total;
            System.out.println("Valor de intereses: " + intereses);
            System.out.println("Valor de inversion final: " + inversion_final);
            System.out.println();
        }
        System.out.println("Valor de total: " + total);
    }

}

