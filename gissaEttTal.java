import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

  public class gissaEttTal {
        int randomTal;
        int försök;
        String svaret;
     
 public gissaEttTal() {   // slumpar ett tal mellan 1 och 100 och tilldelar det till randomTal.
            Random random = new Random();
            randomTal = random.nextInt(100) + 1;
            försök = 0;
            
        }
 public void StartaSpelet() { // Metoden för att starta spelet.
                Scanner scanner = new Scanner(System.in); 
                System.out.println("Gissa ett tal mellan 1 och 100. ");

     while (true) { // skapar en loop.
         try {
                System.out.print("gissning " + (försök + 1) + ": "); // skriver ut gissningsprompten med försök.
                int gissning = scanner.nextInt();
                försök++;

            if (gissning < 1 || gissning > 100) {                    // kollar om gissningen är inom vårt ram 1-100.
                System.out.println("Talet ska vara mellan 1 och 100! ");
                försök--;
                continue;
                }

            if (gissning == randomTal) {                             // om användaren gissar rätt. 
              System.out.println("Rätt! du gissade rätt på " + försök + " försök. ");
              System.out.print("Vill du spela igen (Ja/Nej)? ");
               svaret = scanner.next().toLowerCase();               

            if (svaret.equals("ja")) {                     // om användaren vill spela igen.
                gissaEttTal game = new gissaEttTal();
                game.StartaSpelet();
                }
            else if (svaret.equals("nej")){               // om användaren inte vill spela igen. 
                System.out.print("tack för den här gången! ");
                System.exit(0);}

            } else if (gissning < randomTal){                     // om gissningen är mindre än randomTalet.
                System.out.println("Talet är högre! ");

            } else if (gissning > randomTal){                     // om gissningen är högre än randomTalet.
                System.out.println("Talet är mindre! ");
           } 
           }
              catch (InputMismatchException e) {                  // Om användaren skriver något som inte är ett heltal.
                System.out.println("Du kan bara skriva ett tal med siffror. ");
                scanner.next();                                 
        }
          }
           }
            }