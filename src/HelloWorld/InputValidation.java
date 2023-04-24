package HelloWorld;

import java.util.InputMismatchException;
import java.util.Scanner;
public class InputValidation {
    public static String username,password,phoneNumber;
    public static Scanner input = new Scanner(System.in);
    public static int IDNumber,choice;
    public static short amountPurchased;
    public static String [] choices = new String[] {"Chocolate Chip Cookie","Potato Chips","Gatorade",
                                                    "Chocolate Bar","Peanut Butter Sandwich", "Granola Bar",
                                                    "Bottled Water", "Soda Pop"};
    public static double [] price = new double[] {2.00, 1.50, 1.00, 1.35, 4.50, 0.75, 1.25};



    //-------------DO EDIT BETWEEN EXCEPT FOR DELETING COMMENTS------
    public static void main(String args[])
    {
        Menu();
        System.out.println("---------Welcome to the School Cafeteria!----------");
        System.out.print("Please enter your username: ");
        UsernameCheck();
        
        System.out.print("Please enter your password: ");
        PasswordCheck();
        

        
        System.out.print("Please enter your 9 digit ID number: ");
        IDNumberCheck();
        

        
        System.out.print("Please enter your phone number as XXX-XXX-XXXX : ");
        PhoneNumberCheck();
        


        
        DisplayInfo();
        Menu();
        SelectionChoice();
        System.out.println("Your selection was : "+choice+") "+ choices[choice-1]);
        System.out.println("Each "+choices[choice-1]+" costs : $"+price[choice-1]);
        

        
        System.out.println("");
        System.out.print("How many would you like to purchase: ");
        PurchaseChoice();

        System.out.println("You want to purchase : " +amountPurchased);
        System.out.println("");
        System.out.println("Your total will be: $"+amountPurchased*price[choice-1]);
        
        
    }

    //-------DO EDIT BETWEEN EXCEPT FOR DELETING COMMENTS-------

    public static void UsernameCheck()
    {
    	username = input.nextLine();
    	while((!username.matches("[a-zA-Z]*")) || (username.equals(""))) {
    		System.out.print("Please enter a valid username: ");
    		username = input.nextLine();
    	}
    }

    
    
    public static void PasswordCheck()
    {
    	
    	password = input.nextLine();
    	while((!password.matches("[a-zA-Z0-9]*")) || (password.equals(""))) {
    		System.out.print("Please enter a valid password: ");
    		password = input.nextLine();
    	}
    }

    
    
    public static void IDNumberCheck()
    {
   
    	do {
    		try {
    			IDNumber = input.nextInt();
    			if(String.valueOf(IDNumber).length() != 9) {
    				System.out.print("Please enter a valid ID number: ");
    			}
    		}catch(InputMismatchException e) {
    			System.out.print("Please enter a valid ID number: ");
    			input = new Scanner(System.in);
    		}
    	}while(String.valueOf(IDNumber).length() != 9);
    }

    
    
    public static void PhoneNumberCheck()
    {
    	
    	do {
                phoneNumber = input.next();
                System.out.print("Please enter a valid phone number as XXX-XXX-XXXX: ");
                input = new Scanner(System.in);
    	}while (!phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}"));
           
    }
    
    
    
    public static void SelectionChoice()
    {
    	do {
    		try {
    			choice = input.nextInt();
    			if(choice <= 0 || choice > 8) {
    				System.out.print("Please enter a valid choice: ");
    			}
    		}catch(InputMismatchException e) {
    			System.out.print("Please enter a valid choice: ");
    			input.nextInt();
    		}
    	
    	}while(choice <= 0 || choice > 8);
    	
    }

    
    
    public static void PurchaseChoice ()
    {
    	
    	do {
    		try {
    			amountPurchased = input.nextShort();
    			if(amountPurchased <= 0 || amountPurchased > 20) {
    				System.out.print("Please enter a valid purchase amount: ");
    			}
    		}catch(InputMismatchException e) {
    			System.out.print("Please enter a valid purchase amount: ");
    			input.nextShort();
    		}
    	
    	}while(amountPurchased <= 0 || amountPurchased > 20);
    	
    }
    
    

    public static void DisplayInfo()
    {
        System.out.println("Your valid username is : " + username);
        System.out.println("Your valid password is : " + password);
        System.out.println("Your valid ID number is : "+IDNumber);
        System.out.println("Your valid PhoneNumber is : "+phoneNumber);

    }

    public static void Menu()
    {
        System.out.println("------Please make a selection!------");
        System.out.println("1) Chocolate Chip Cookie    5) Peanut Butter Sandwich");
        System.out.println("2) Potato Chips             6) Granola Bar");
        System.out.println("3) Gatorade	            7) Bottled Water");
        System.out.println("4) Chocolate Bar            8) Soda Pop");
        System.out.print("Selection: ");
    }
}
