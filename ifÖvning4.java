import java.util.Scanner;

public class ifÖvning4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ange ålder");
        int ålder = scanner.nextInt();

        if (ålder < 18) {
            System.out.println("Du är ej myndig. ");
        } else if (ålder > 65) {
            System.out.println("Du är pensionär. ");
        } else {
            System.out.println("du är myndig men inte pensionär. ");
          }
          scanner.close();
    }
}
