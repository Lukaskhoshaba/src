import java.util.Scanner;

public class ifÖvning3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
      
        System.out.print("Ange temperaturen (i Celsius): ");
        double temp = scanner.nextDouble();


        if (temp > 39.5) {
            System.out.println("Du bör uppsöka läkare.");
        } else if (temp > 37.8) {
            System.out.println("Du har feber.");
        } else {
            System.out.println("du har inte feber. ");
        }
            scanner.close();
    }
}
