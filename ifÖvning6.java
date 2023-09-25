import java.util.Scanner;

public class ifÖvning6 {
    public static void main(String[] args) {
        

  Scanner scanner = new Scanner(System.in);

  System.out.print("Ange ditt födelseår: ");
  int födelseår = scanner.nextInt();

  scanner.close();

  if (födelseår >= 1980 && födelseår < 1990) {
      System.out.println("Du är född på 1980 talet. ");
 } else if (födelseår >= 1990 && födelseår < 2000) {
    System.out.println("Du är född på 1990 talet. ");
 } else {
    System.out.println("Du är inte född på 1990 eller 1980 talet.");
    
 }

    }
}
