import java.util.Scanner;

public class Övning5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Mata in tal 1:");
        int Tal1 = scanner.nextInt();
         
        System.out.println("Mata in tal 2:");
        int Tal2 = scanner.nextInt();
        
        scanner.close();
        
        int summa = Tal1 + Tal2;

        System.out.println("summan av tal 1 och tal 2 är " + summa);
         
    }
   
    
}
