import java.util.Scanner;

public class EjercicioDoWhile04ACJ {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int aprobados, i, n, reprobados;
        double calificacion, calificacion_aprobatoria;
        aprobados = 0;
        reprobados = 0;
        System.out.println("Ingrese el valor de la calificacion Aprobatoria: ");
        calificacion_aprobatoria = lt.nextDouble();
        lt.nextLine();
        System.out.println("Ingrese el valor de n: ");
        n = lt.nextInt();
        lt.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.println("Ingrese el valor de la calificacion: ");
            calificacion = lt.nextDouble();
            lt.nextLine();
            if(calificacion>=calificacion_aprobatoria)
                aprobados=aprobados+1;
            else
                reprobados=reprobados+1;
            System.out.println();
        }
        System.out.println(" Valor de aprobados: " + aprobados);
        System.out.println(" Valor de reprobados: " + reprobados);
    }

}