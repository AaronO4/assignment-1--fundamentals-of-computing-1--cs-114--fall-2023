// Import libraries here
import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {

//variable graveyard
double temperature;
double makeCel = (.556);
int consReduction = 32;
double temp;
double tempFinal;
final int MAX = 16352; //16384 total, 32 subtracted from Min
int faceValue;

//code starts here
System.out.println("     AAA         OOOOOOOOOO");
System.out.println("    AA AA       OOO      OOO");
System.out.println("   AA   AA      OO        OO");
System.out.println("  AAAAAAAAA     OO        OO");
System.out.println(" AA       AA    OOO      OOO");
System.out.println("AA         AA    OOOOOOOOOO");

Scanner scan = new Scanner(System.in);

System.out.println("Enter a temperature in Fahrenheit:");
temperature = scan.nextInt();
temp = (temperature - consReduction);
tempFinal = temp * makeCel;
System.out.println((int)tempFinal);


// put string assignment here
String fiveLetterString = scan.nextLine();

scan.close(); // this goes at the very very end of scan functions.

//rolls dice
  faceValue = (int)(Math.random() * MAX) + 32; 
  System.out.println(faceValue);

  }
}
