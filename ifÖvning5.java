import java.util.Scanner;

public class ifÖvning5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ange din kategori (vuxen, pensionär eller student:) ");
        String kategori = scanner.nextLine().toLowerCase();
        int kostnad;
        if (kategori.equals("vuxen")) {
            kostnad = 30;
            System.out.println("Resan kostar 30 kr. ");

        } else if (kategori.equals("pensionär") || kategori.equals("student")) {
            kostnad = 20;
            System.out.println("Resan kostar 20 kr. ");
        } else {
            kostnad = 0;
            System.out.println("felaktig Kategori. Ange vuxen, pensionär eller student. ");
        }
        
             scanner.close();
        }
    }