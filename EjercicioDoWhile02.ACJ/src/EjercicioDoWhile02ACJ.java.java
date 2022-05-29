import java.util.Scanner;

public class EjercicioDoWhile02ACJ {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int i, n;
        double categoria1, categoria2, categoria3, clave, costo;
        double impuesto, impuestoapagar;
        categoria1 = 0;
        categoria2 = 0;
        categoria3 = 0;
        impuestoapagar = 0;
        System.out.println("Ingrese el valor de n: ");
        n = lt.nextInt();
        lt.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de clave: ");
            clave = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa el valor de costo: ");
            costo = lt.nextDouble();
            lt.nextLine();
            impuesto=0;
            if(clave==1)
            {
                impuesto=costo*0.1;
                categoria1=categoria1+impuesto;
            }
            if(clave==2)
            {
                impuesto=costo*0.07;
                categoria2=categoria2+impuesto;
            }
            if(clave==3)
            {
                impuesto=costo*0.05;
                categoria3=categoria3+impuesto;
            }
            impuestoapagar=impuestoapagar+impuesto;
            System.out.println("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria1);
        System.out.println("Valor de categoria 2: " + categoria2);
        System.out.println("Valor de categoria 3: " + categoria3);
        System.out.println("Valor de impuesto a pagar: " + impuestoapagar);
    
    }
}