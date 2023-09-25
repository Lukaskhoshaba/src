import java.util.Scanner;

public class Övning7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Mata in tal 1 ");
        int Tal1 = scanner.nextInt();

        System.out.print("Mata in tal 2 ");
        int Tal2 = scanner.nextInt();

        int medelvärde = (Tal1 + Tal2) / 2;
        int summa = (Tal1 + Tal2);
        int differens = (Tal1 - Tal2);

        System.out.println("medelvärde " + medelvärde);
        System.out.println("summa " + summa);
        System.out.println("differens " + differens);

            scanner.close();
    }


}
