import java.util.Scanner;

public class EsercizioMetodi2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

  
    System.out.println("Inserisci la base del rettangolo:");
    double base = in.nextDouble();

    System.out.println("Inserisci l'altezza del rettangolo:");
    double altezza = in.nextDouble();
    
    double area = calcolaAreaRettangolo(base, altezza);

    System.out.println("L'area del rettangolo è: " + area);
  }

  private static double calcolaAreaRettangolo(double base, double altezza) {
    return base * altezza;
  }
}