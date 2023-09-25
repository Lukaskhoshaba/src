import java.util.Scanner;

public class ifÖvning8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

      System.out.print("Ange summan du har: ");
      double summan = scanner.nextDouble();

      System.out.print("Har du rabatt? Ange true eller false. ");
      boolean HarRabatt = scanner.nextBoolean();
      
      scanner.close();

      if (summan >= 15 && summan <=25){
            if (HarRabatt) {
         System.out.println("Du kan köpa en liten hamburgare och en pommes. ");

        }else {
            System.out.println("Du kan köpa en hamburgare. ");
        }
        } else if (summan > 60 || (summan >= 50 && HarRabatt)) {
            System.out.println("Du kan köpa ett meal med dryck. ");
    
        } else{
            System.out.println("Din summa är inte tillräcklig för att köpa något. ");
        }
    

    }
}
