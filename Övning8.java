import java.util.Scanner;

public class Övning8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Ange Summa: ");
        int summa = scanner.nextInt();

        double moms = 0.25 * summa;
        double summa_med_moms = summa + moms;
        System.out.println("Summa med 25% moms: " + summa_med_moms);
             
         scanner.close();

    }
}
