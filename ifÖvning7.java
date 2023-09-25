import java.util.Scanner;

public class ifÖvning7 {
   public static void main(String[] args) {
    
   Scanner scanner = new Scanner (System.in);

   System.out.print("Ange namnet på ditt land: ");
   String land = scanner.nextLine().trim().toLowerCase();

   scanner.close();

   if (land.equals("sverige") || land.equals("danmark") || land.equals("norge")){
    System.out.println("Du bor i skandinavien");
   } else {
       System.out.println("Du bor inte i skandinavien.");
   }
   


   } 
}
