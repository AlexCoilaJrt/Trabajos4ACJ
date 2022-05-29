import java.util.Scanner;

public class EjercicioDoWhile06ACJ {
    public static void main(String[] args) throws Exception {
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int n=lt.nextInt();
        int prod=lt.nextInt();
        for (int i =0 ; i <= 10; i++) {
            prod =n*i;
            System.out.println(n+"x"+i+"="+prod);
            
        }
        
 }

}
