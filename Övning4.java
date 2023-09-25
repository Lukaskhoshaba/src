import java.util.Scanner;

public class Övning4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Skriv in ditt förnamn: ");
        String Förnamn = scanner.nextLine();

        System.out.print("Skriv in ditt efternamn: ");
        String Efternamn = scanner.nextLine();
        
        scanner.close();

        System.out.println("Du heter " + Efternamn + ", " + Förnamn);


    }
}
