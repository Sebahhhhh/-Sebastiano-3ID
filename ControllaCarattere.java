
import java.util.Scanner;

public class ControllaCarattere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        System.out.println("Inserisci un carattere da verificare");
      
        char ch = in.next().charAt(0);
        
        boolean isVocale = false;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            isVocale = true;
        } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            isVocale = true;
        }
      else {
        isVocale = false;
      }
        

        System.out.println(isVocale);
    }
}