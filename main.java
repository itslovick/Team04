
package gamesTop;

/**
 *
 * @author Abhi
 */

import java.util.Scanner;
public class main
{
    
    public static void main(String[] args)
    {
        // Variables.
        int loginChoice;
        int memChoice;
        int sysChoice;
        int genreChoice;
        int gameChoice;
        
        String firstName;
        String lastName;
        String middleInitial;
        String email;
        int memberType = 0;
        String password;
        String username;
        
        

        // Create game directory arrays.
        String [] title = new String[50];
        String [] genre = new String[50];
        String [] quantity = new String[50];
        String [] id_num = new String[50];

        // Create scanner object.
        Scanner input = new Scanner(System.in);

        // Create Menu object.
        Menu menu = new Menu();
        
    
        
//        Customer object[] = new Customer[4];
//        object[0] = new Customer();
        
 
        
        // Print login menu.
        menu.printLoginMenu();
        loginChoice = input.nextInt();
        
        // If login.
        if (loginChoice == 1)
        {
            System.out.println("Username:");
            username = input.next();
            
            System.out.println("Password");
            password = input.next();
            
            // Compare username & password to account data in files.
            
            // If credentials are true, print system menu.
            if (username == fileUsername && password == filePassword)
            {
                menu.printSystemMenu();
            }
            
        }
        // If register.
        else if (loginChoice == 2)
        {
            System.out.print("First name: ");
            firstName = input.next();
            
            System.out.print("Last name: ");
            lastName = input.next();
            
            System.out.print("Middle initial: ");
            middleInitial = input.next();
            
            System.out.print("Email: ");
            email = input.next();
            
            System.out.print("Username: ");
            username = input.next();
            
            System.out.println("Password");
            password = input.next();
            
            System.out.println("Would you like to enroll in our premium member program?");
            System.out.println("There are benefits such as discounts and other perks.");
            System.out.println("Type 1 for yes, 2 for no.");
            memChoice = input.nextInt();
            
            //----------------------- I F  P R E M I U M  C H O I C E  -----------------------
            if (memChoice == 1)
            {
                // Create new premium account.
                Premium premiumMem = new Premium(firstName, lastName, middleInitial, email, memberType, username, password);
                System.out.println("New premium member created!");
                
                // Print system menu.
                menu.printSystemMenu();
                sysChoice = input.nextInt();
                
                // If rent game.
                if (sysChoice == 1)
                {
                    // Print genre menu.
                    menu.printGenreMenu();
                    genreChoice = input.nextInt();
                    
                    switch (genreChoice)
                    {
                        // Adventure.
                        case 1:
                        {
                            // Print adventure games.
                            menu.printAdventure();
                            gameChoice = input.nextInt();
                            premiumMem.rentGame(gameChoice); // take in game choice and communicate game to account.
                        }
                        break;
                        
                        // Action.
                        case 2:
                        {
                            // Print adventure games.
                            menu.printAction();
                            gameChoice = input.nextInt();
                            premiumMem.rentGame(gameChoice); // take in game choice and communicate game to account.
                        }
                        break;
                        
                        // RPG.
                        case 3:
                        {
                            // Print RPG games.
                            menu.printRPG();
                            gameChoice = input.nextInt();
                            premiumMem.rentGame(gameChoice); // take in game choice and communicate game to account.
                        }
                        break;
                        
                        // Sports.
                        case 4:
                        {
                            // Print sports games.
                            menu.printSports();
                            gameChoice = input.nextInt();
                            premiumMem.rentGame(gameChoice); // take in game choice and communicate game to account.
                        }
                        break;
                        
                        // Strategy.
                        case 5:
                        {
                            // Print strategy games.
                            menu.printStrategy();
                            gameChoice = input.nextInt();
                            premiumMem.rentGame(gameChoice); // take in game choice and communicate game to account.
                        }
                        break;
                        
                        // Indie.
                        case 6:
                        {
                            // Print indie games.
                            menu.printIndie();
                            gameChoice = input.nextInt();
                            premiumMem.rentGame(gameChoice); // take in game choice and communicate game to account.
                        }
                        break; 
                            
                        // MMORPG.
                        case 7:
                        {
                            // Print MMORPG games.
                            menu.printMMORPG();
                            gameChoice = input.nextInt();
                            premiumMem.rentGame(gameChoice); // take in game choice and communicate game to account.
                        }
                        break;
                            
                        // Casual.
                        case 8:
                        {
                            // Print casual games.
                            menu.printCasual();
                            gameChoice = input.nextInt();
                            premiumMem.rentGame(gameChoice); // take in game choice and communicate game to account.
                        }
                        break;
                        
                        // Simulation.
                        case 9:
                        {
                            // Print simulation games.
                            menu.printSimulation();
                            gameChoice = input.nextInt();
                            premiumMem.rentGame(gameChoice); // take in game choice and communicate game to account.
                        }
                        break;
                            
                        // Racing.
                        case 10:
                        {
                            // Print racing games.
                            menu.printRacing();
                            gameChoice = input.nextInt();
                            premiumMem.rentGame(gameChoice); // take in game choice and communicate game to account.
                        }
                        break;
                      
                        default: System.out.println("Choose number 1 - 10!");       
                    }
                    
                }
                // If view account.
                else if (sysChoice == 2)
                {
                    // Print account menu.
                    premiumMem.viewAccount();
                    
                }
                // If sign out.
                else
                {
                    System.out.println();
                    System.out.println("Signing out..");
                    System.out.println("Goodbye, come again!");
                    System.exit(0);
                }
                
            }
            //----------------------- I F  G A M E R  C H O I C E -------------------------
            else if (memChoice == 2)
            {
                // Create new gamer(base) account.
                Gamer gamerMem = new Gamer(firstName, lastName, middleInitial, email, memberType, username, password);
                System.out.println("New gamer member created!");
            }
        }
        // If quit.
        else
        {
            System.out.println();
            System.out.println("Goodbye, come again!");
            System.exit(0);
        }
        
        
      


        

        
        input.close();
    }
    
    
    // Add to customer class ***
    public void rentGame()
    {
        
    }
   
    public void viewAccount()
    {
        
    }
 
   

    

    
    
    
    
    
    
    
    
}
