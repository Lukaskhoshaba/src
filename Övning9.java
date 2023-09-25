
import java.util.Scanner;

public class Övning9 {

public static void main(String[] args) {
    Scanner  scanner = new Scanner (System.in);
    
    System.out.print("Mata in antal minuter (minst 60 minuter): ");

    int Minuter = scanner.nextInt();
    int timmar = Minuter / 60;
    int restMinuter = Minuter % 60;
    
    System.out.println("detta är " + timmar + " timmar och " + restMinuter + " minuter");



}







    
}
