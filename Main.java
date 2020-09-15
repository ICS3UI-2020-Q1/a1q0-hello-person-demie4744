import java.util.Scanner;
/**
 * This program greets the user and calculates their approximate age
 * @author Erkam
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    
      // declare a varible that will store a name
    String name; 

System.out.println("Please enter your name:");
 // initalize the user's name
 name = input.nextLine();

  // say hello to the user
       System.out.println("Hello " + name + "!");

  // ask the user for their Year of birth
System.out.println("Please enter the year you were born:");
// declare and initalize variable for the birth year
int birthYear = input.nextInt();

// declare and initalize constant for the current year
final int CURRENT_YEAR = 2020;

// declare and calculate the user's age
int age = CURRENT_YEAR - birthYear;

// tell the user their age
System.out.println(" You are " + age + " years old.");
  }
}