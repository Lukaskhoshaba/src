import java.util.Scanner;

public class IfÖvning1 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("ange ett tal: ");
    double tal1 = scanner.nextDouble();

    if (tal1 > 10){
       System.out.println("Talet är större än 10.");
      } else if (tal1 < 10) {
        System.out.println("Talet är mindre än 10.");
      } else {
        System.out.println("Talet är lika med 10.");
      }

      scanner.close();
    }
}
