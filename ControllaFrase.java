import java.util.Scanner;

public class ControllaFrase { 
  public static void main(String[] args) {

    Scanner in = new Scanner (System.in);

    String vocali = "";
    String consonanti = "";
    int spazi = 0;
    String caratteri = "";
    
       System.out.print("Inserisci la frase: ");
       String frase = in.nextLine();  

      for (int i=0; i<frase.length(); i++){
      if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u' ||  frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U')
      {
        
        vocali = vocali + frase.charAt(i);
      }
    else 
      if (frase.charAt(i) == ' '){
         spazi++;
      }
     else
      if (frase.charAt(i) == 'b' || frase.charAt(i) == 'c' || frase.charAt(i) == 'd' || frase.charAt(i) == 'f' || frase.charAt(i) == 'g' || frase.charAt(i) == 'h' || frase.charAt(i) == 'j' || frase.charAt(i) == 'k' || frase.charAt(i) == 'l' || frase.charAt(i) == 'm' || frase.charAt(i) == 'n' || frase.charAt(i) == 'p' || frase.charAt(i) == 'q' || frase.charAt(i) == 'r' || frase.charAt(i) == 's' || frase.charAt(i) == 't' || frase.charAt(i) == 'v' || frase.charAt(i) == 'w' || frase.charAt(i) == 'x' || frase.charAt(i) == 'y' || frase.charAt(i) == 'z' || frase.charAt(i) == 'B' || frase.charAt(i) == 'C' || frase.charAt(i) == 'D' || frase.charAt(i) == 'F' || frase.charAt(i) == 'G' || frase.charAt(i) == 'H' || frase.charAt(i) == 'J' || frase.charAt(i) == 'K' || frase.charAt(i) == 'L' || frase.charAt(i) == 'M' || frase.charAt(i) == 'N' || frase.charAt(i) == 'P' || frase.charAt(i) == 'Q' || frase.charAt(i) == 'R' || frase.charAt(i) == 'S' || frase.charAt(i) == 'T' || frase.charAt(i) == 'V' || frase.charAt(i) == 'W' || frase.charAt(i) == 'X' || frase.charAt(i) == 'Y' || frase.charAt(i) == 'Z') {
      consonanti = consonanti + frase.charAt(i);
     }
        else {
          caratteri = caratteri + frase.charAt(i);
          
        }
        
      }    
    System.out.println("Le vocali sono: " + vocali);
    System.out.println("Le consonanti sono: " + consonanti);
    System.out.println("I caratteri speciali sono: " + caratteri);
    System.out.println("Gli spazi sono: " + spazi);
      }
  }
    

  
