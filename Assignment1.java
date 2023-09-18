// Import libraries here

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
System.out.println("     AAA         OOOOOOOOOO");
System.out.println("    AA AA       OOO      OOO");
System.out.println("   AA   AA      OO        OO");
System.out.println("  AAAAAAAAA     OO        OO");
System.out.println(" AA       AA    OOO      OOO");
System.out.println("AA         AA    OOOOOOOOOO");

Scanner scan = new Scanner(System.in);

System.out.println("Enter a temperature in Fahrenheit:");
int temperature = scan.nextLine(); // taking input
float makeCel = (5.0/9.0);
float temp = ((temperature - 32) * makeCel);
System.out.println(temp);
  }
}
