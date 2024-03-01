import java.util.Scanner;

public class EsercizioMetodi4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Inserisci un anno: ");
        int anno = in.nextInt();

        
        boolean bis = bisestile(anno);

        
        if (bis) {
            System.out.println("Anno bisestile");
        } else if (anno < 0) {
            System.out.println("Errore");
        } else {
            System.out.println("Anno non bisestile");
        }
    }

    public static boolean bisestile(int anno) {

      //verifica dell'anno bisestile
        if (anno % 4 == 0) {
            
            if (anno % 100 == 0) {
                
                if (anno % 400 == 0) {
                   
                    return true;
                } else {
                    
                    return false;
                }
            } else {
                
                return true;
            }
        } else {
            
            return false;
        }
    }
}
