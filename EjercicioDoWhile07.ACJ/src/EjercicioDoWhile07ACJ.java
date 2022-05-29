import java.util.Scanner;

public class EjercicioDoWhile07ACJ {

    public static void main(String[] args) {
        Scanner lt= new Scanner(System.in);
        int billetedecincuenta, billetesdediez, billetesdeveinte, cantidad_de_dinero;
        int monedasdecinco, monedasdedos,monedasdeunsol;
        System.out.print("Ingresa el valor de billetes de cincuenta: ");
        billetedecincuenta= lt.nextInt();
        lt.nextLine();
        System.out.print("Ingresa el valor de billetes de diez: ");
        billetesdediez = lt.nextInt();
        lt.nextLine();
        System.out.print("Ingresa el valor de billetes de veinte: ");
        billetesdeveinte = lt.nextInt();
        lt.nextLine();
        System.out.print("Ingresa el valor de monedas de cinco: ");
        monedasdecinco = lt.nextInt();
        lt.nextLine();
        System.out.print("Ingresa el valor de monedas de diez: ");
        monedasdedos = lt.nextInt();
        lt.nextLine();
        System.out.print("Ingresa el valor de monedas de un peso: ");
        monedasdeunsol = lt.nextInt();
        lt.nextLine();
        cantidad_de_dinero=monedasdecinco*10+monedasdedos*5+monedasdeunsol+billetesdediez*10+billetesdeveinte*20+billetedecincuenta*50;
        System.out.println("Valor de cantidad de dinero: " + cantidad_de_dinero);
    }

}