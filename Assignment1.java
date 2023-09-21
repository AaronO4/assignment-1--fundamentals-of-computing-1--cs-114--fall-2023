// Import libraries here
import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {

//variable graveyard
double temperature;
double makeCel = (.5556);
int consReduction = 32;
double temp;
double tempFinal;
String fiveLetterString;
final int MAX = 16352; //16384 total, 32 subtracted from Min
int diceRoller;

//code starts here
System.out.println("     AAA         OOOOOOOOOO");
System.out.println("    AA AA       OOO      OOO");
System.out.println("   AA   AA      OO        OO");
System.out.println("  AAAAAAAAA     OO        OO");
System.out.println(" AA       AA    OOO      OOO");
System.out.println("AA         AA    OOOOOOOOOO");

// turns F to C
Scanner scan = new Scanner(System.in);
System.out.println("Enter a temperature in Fahrenheit:");
temperature = scan.nextInt();
temp = (temperature - consReduction);
tempFinal = temp * makeCel;
System.out.println((int)tempFinal);

// backwards string assignment here
Scanner scan2 = new Scanner(System.in);
System.out.println("Enter a five character string:");
fiveLetterString = scan2.nextLine();

String reverse = new StringBuffer(fiveLetterString).reverse().toString();
String reverseTrim = (reverse.substring(1, reverse.length() - 1));
System.out.println(reverseTrim);
scan.close(); // this goes at the very very end of scan functions.

//rolls dice
diceRoller = (int)(Math.random() * MAX) + 32; 
System.out.println(diceRoller);

//FINAL STEP
System.out.println("Random number generated. Continuing...");
System.out.println(((int)tempFinal) + reverseTrim + diceRoller);

   }
 }
