import java.util.Scanner;

public class EsercizioMetodi3 {

    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);

        
        System.out.print("Inserisci la base del rettangolo: ");
        double base = in.nextDouble();

        System.out.print("Inserisci l'altezza del rettangolo: ");
        double altezza = in.nextDouble();

        
        double perimetro = perimetroRettangolo(base,  altezza);

        
        System.out.println("Il perimetro del rettangolo è: " + perimetro);
    }

    private static double perimetroRettangolo(double base, double  altezza) {
        
        double perimetro = 2 * base + 2 *  altezza;

       
        return perimetro;
    }
}
