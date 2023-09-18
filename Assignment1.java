// Import libraries here
import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
System.out.println("     AAA         OOOOOOOOOO");
System.out.println("    AA AA       OOO      OOO");
System.out.println("   AA   AA      OO        OO");
System.out.println("  AAAAAAAAA     OO        OO");
System.out.println(" AA       AA    OOO      OOO");
System.out.println("AA         AA    OOOOOOOOOO");

int temperature;
int makeCel = (5 / 9);
int consReduction = 32;
int temp;
Scanner scan = new Scanner(System.in);

System.out.println("Enter a temperature in Fahrenheit:");
temperature = scan.nextInt();
temp = (temperature - consReduction) * makeCel;
System.out.println(temp);
scan.close();

  }
}
