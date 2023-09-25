import java.util.Scanner;

public class ifövning2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange antal paket mjölk som finns kvar: ");
        int antalmjölk = scanner.nextInt();

        if (antalmjölk < 10) {
            System.out.println("beställ 30 paket. ");
        }   else if (antalmjölk >= 10 && antalmjölk <= 20) {
            System.out.println("beställ 20 paket. ");
        }   else {
            System.out.println("Du behöver inte beställa någon mjölk. ");
        }
            scanner.close();
    }
}
