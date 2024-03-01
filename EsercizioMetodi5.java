import java.util.Scanner;

public class EsercizioMetodi5 {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci una serie di numeri: ");
      
        String numeriStringa = in.nextLine();

        String[] numeri = numeriStringa.split(" ");

        for (String numeroStringa : numeri) {
            int numero = Integer.parseInt(numeroStringa);
            boolean pari = isPari(numero);

            System.out.println(numero + " è pari? " + pari);
        }
    }

    public static boolean isPari(int numero) {
        return numero % 2 == 0;
    }
}
