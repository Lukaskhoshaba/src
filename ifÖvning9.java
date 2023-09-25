import java.util.Scanner;

public class ifÖvning9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ange beloppet att betala:");
        double BetalaBelopp = scanner.nextDouble();

        scanner.close();

        double antal500lappar = (double) (BetalaBelopp / 500);
        BetalaBelopp %=500;
        
        double antal100Lappar = (double) (BetalaBelopp / 100);
        BetalaBelopp %= 100;

        double antalkronar = (double) BetalaBelopp;

        System.out.println("växel tillbaka");
        System.out.println("Antal 500 Lappar: " + antal500lappar);
        System.out.println("Antal 100 Lappar: " + antal100Lappar);
        System.out.println("Antal kronor: " + antalkronar);
    }
}
