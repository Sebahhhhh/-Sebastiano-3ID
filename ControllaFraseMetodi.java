import java.util.Scanner;
public class ControllaFraseMetodi {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    String vocali = "";
    String consonanti = "";
    int spazi = 0;
    String caratteri = "";
    
    System.out.print("Inserisci la frase: ");
    String frase = in.nextLine();
    for (int i = 0; i < frase.length(); i++) {
      if (isVocal(frase.charAt(i))) {
        vocali = vocali + frase.charAt(i);
      } else if (isConsonant(frase.charAt(i))) {
        consonanti = consonanti + frase.charAt(i);
      } else if (frase.charAt(i) == ' ') {
        spazi++;
      } else {
        caratteri = caratteri + frase.charAt(i);
      }
    }
    System.out.println("Le vocali sono: " + vocali);
    System.out.println("Le consonanti sono: " + consonanti);
    System.out.println("I caratteri speciali sono: " + caratteri);
    System.out.println("Gli spazi sono: " + spazi);
  }
  public static boolean isVocal(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
  }
  public static boolean isConsonant(char c) {
    return c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't' || c == 'v' || c == 'w' || c == 'x' || c == 'y' || c == 'z' || c == 'B' || c == 'C' || c == 'D' || c == 'F' || c == 'G' || c == 'H' || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'P' || c == 'Q' || c == 'R' || c == 'S' || c == 'T' || c == 'V' || c == 'W' || c == 'X' || c == 'Y' || c == 'Z';
  }
}