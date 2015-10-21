
package gamestop;

/**
 *
 * @author Abhi
 */

import java.util.Scanner;
public class main 
{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        Customer object[] = new Customer[4];
        object[0] = new Customer();
        System.out.println("Welcome to the GamesTop online store!");
        System.out.println("Please select one of the following options:");
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("3.Quit");
        int choice = input.nextInt();
        
        if(choice == 1)
        {
        System.out.println("Please enter your first name:");
        String fName = input.next();
        System.out.println("Please enter your last name:");
        String lName = input.next();
        System.out.println("Please enter your middle initial:");
        String mName = input.next();
        System.out.println("Please enter your email:");
        String email = input.next();     
        }
        else if (choice == 2)
        {
        System.out.println("Please enter your first name:");
        String fName = input.next();
        System.out.println("Please enter your last name:");
        String lName = input.next();
        System.out.println("Please enter your middle initial:");
        String mName = input.next();
        System.out.println("Please enter your email:");
        String email = input.next();
        System.out.println("Would you like to enroll in our premium member program?");
        System.out.println("There are benefits such as discounts and other perks.");
        System.out.println("Type 1 for yes, 2 for no.");
        int premium = input.nextInt();
        }
        
        else
        {
            System.out.println("Goodbye.");
            System.exit(0);
        }
        


        System.out.println("Plase select a category of game:");
        System.out.println("Please enter the corresponding number value.");
        System.out.println("1. Adventure");
        System.out.println("2. Action");
        System.out.println("3. RPG");
        System.out.println("4. Sports");
        System.out.println("5. Strategy");
        System.out.println("6. Indie");
        System.out.println("7. MMORPG");
        System.out.println("8. Causual");
        System.out.println("9. Simulation");
        System.out.println("10. Racing");
        int choice1 = input.nextInt();
        

        
        input.close();
    }
    
}
