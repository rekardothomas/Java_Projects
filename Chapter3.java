/**

 Name: Rekardo Thomas
 Course: CIS144
 Purpose: Chapter 3 - Coding assignment
 This is the code for all Chapter 3 assignments 3.1, 3.17, 3.25, 3.33


 */


import java.util.*;
import java.lang.*;

public class Chapter3 {
    public static void programmingExercise3_1() {
        
        Scanner input = new Scanner(System.in);

        //Enter values for a, b , and c
        System.out.print("Enter Value for a: ");
        double aInput = input.nextDouble();

        System.out.print("Enter Value for b: ");
        double bInput = input.nextDouble();

        System.out.print("Enter Value for c: ");
        double cInput = input.nextDouble();

        //Discriminant
        double discriminant = (bInput * bInput - 4 * aInput * cInput);

        //Calculates the root 1 and root 2
        double root_1 = ((-bInput) + Math.pow(discriminant, 0.5)) / (2 * aInput);
        double root_2 = ((-bInput) - Math.pow(discriminant, 0.5)) / (2 * aInput);

        //Checks if Discriminant is 0 , less than 0 , or greater than 0 , then prints results
        if (discriminant > 0) {
            System.out.println("The equation has two roots. " + root_1 + " and " + root_2);
        } else if (discriminant < 0) {
            System.out.println("The equation has no real roots.");

        } else {
            System.out.printf("The equation has one root. " + root_1);

        }
    }
    
    public static void programmingExercise3_17 (){
        
        Scanner input = new Scanner(System.in);



        while (true) {
            
            System.out.print("(1)Paper, (2) Scissors, (3) Rock : ");
            int userChoice = input.nextInt();
            if (userChoice >= 4) {
                System.out.println(userChoice + " is invalid.");

            }

            // Prints the choice of the user

            if (userChoice == 3)
                System.out.println("You chose Rock.");
            else if (userChoice == 2)
                System.out.println("You chose Scissors.");
            else if (userChoice == 1)
                System.out.println("You chose Paper.");
          

            // Outputs random number from opponent
            int computer = (int) (Math.random() * 3 + 1);

            if (computer == userChoice)
                System.out.println("It's a tie.");

            if (computer == 3 && userChoice == 2)
                System.out.println("Computer chose Rock. You Lose!");

            else if (computer == 3 && userChoice == 1)
                System.out.println("Computer chose Rock. You Win!");

            else if (computer == 2 && userChoice == 3)
                System.out.println("Computer chose Scissors. You Win!");

            else if (computer == 2 && userChoice == 1)
                System.out.println("Computer chose Scissors. You Lose!");

            else if (computer == 1 && userChoice == 3)
                System.out.println("Computer chose Paper. You Lose!");

            else if (computer == 1 && userChoice == 2)
                System.out.println("Computer chose Paper. You Win!");

            System.out.println("Continue Playing? (y/n) ");
            String KeepPlaying = input.next();
            if (KeepPlaying.equalsIgnoreCase("N")) { 
                System.out.println("Thanks for playing!");
                break;
            }

        }
        
    } 
    
        public static void programmingExercise3_25() {
        
        Scanner input = new Scanner(System.in);

        //Enter x and y points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        System.out.print("Enter x4: ");
        double x4 = input.nextDouble();

        System.out.print("Enter y4: ");
        double y4 = input.nextDouble();
        
        
       //This code get the values of a through f 
		double a = y1 - y2;
		double b = (x1 - x2) * -1;
		double c = y3 - y4;
		double d = (x3 - x4) * -1;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		//This code is Cramer's law to find x and y
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		// intersect points equation
		double intersect_Point = (a * d) - (b * c);
		
		//This code determines if the lines are parallel or not
		if (intersect_Point  == 0) {
		
			System.out.println("The two lines are parallel");
		}
		
		else {
		    
		System.out.println("The intersecting point is at (" + x + " and " + y + ")");
		    
	    }
    }
   
   
    public static void programmingExercise3_33 () {

        Scanner input = new Scanner(System.in);


        //Enter weight of rice package 1
        System.out.print("Enter weight in pounds for package 1: ");
        double riceWeight1 = input.nextDouble();

        //Enter price of rice package 1
        System.out.print("Enter price for package 1: $");
        double ricePrice1 = input.nextDouble();

        //Enter weight of rice package 2
        System.out.print("Enter weight in pounds for package 2: ");
        double riceWeight2 = input.nextDouble();

        //Enter price of rice package 2
        System.out.print("Enter price for package 2: $");
        double ricePrice2 = input.nextDouble();

        double package1_total = ricePrice1 / riceWeight1;

        double package2_total = ricePrice2 / riceWeight2;

        if (package1_total > package2_total) {
            System.out.println("Package 2 is a better deal.");
        } else if (package1_total < package2_total) {
            System.out.println("Package 1 is a better deal.");
        } else if (package1_total == package2_total)
            System.out.println("Packages are the same.");


    }
    
}
        
        
