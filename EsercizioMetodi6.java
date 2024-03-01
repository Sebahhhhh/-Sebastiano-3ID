import java.util.Scanner;

public class EsercizioMetodi6 {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci una sequenza di coppie di numeri: ");
        String numeriStringa = in.nextLine();

        String[] numeri = numeriStringa(" ");

        if (numeri.length % 2 != 0) {
            System.out.println("Numero di elementi non valido.");
            return;
        }

        for (int i = 0; i < numeri.length; i += 2) {
            String primoNumeroStringa = numeri[i];
            String secondoNumeroStringa = numeri[i + 1];

            boolean multiplo = isMultiplo(primoNumeroStringa, secondoNumeroStringa);

            System.out.println(secondoNumeroStringa + " è multiplo di " + primoNumeroStringa + "? " + multiplo);
        }
    }

    public static boolean isMultiplo(String primoNumeroStringa, String secondoNumeroStringa) {
      
        int primoNumero = Integer.parseInt(primoNumeroStringa);
        int secondoNumero = Integer.parseInt(secondoNumeroStringa);

        return secondoNumero % primoNumero == 0;
    }
}
