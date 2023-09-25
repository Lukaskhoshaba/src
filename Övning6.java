import java.time.LocalDate;
import java.util.Scanner;

public class Övning6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ange ditt födelseår (YYYY): ");
        int Födeleseår = scanner.nextInt();

        LocalDate Dagens_Datum = LocalDate.now();

        int Ålder = Dagens_Datum.getYear() - Födeleseår;

        System.out.println("Din ålder är " + Ålder + " år");
        
        scanner.close();



    }
}
