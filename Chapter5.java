  /**

 Name: Rekardo Thomas
 Course: CIS144
 Purpose: Chapter 5 - Coding assignment
 This is the code for all Chapter 5 assignments 5.21, 5.31, 5.45, 5.47


 */ 
    
    import java.util.*;
    
    public class Chapter5 {
    
    public static void ProgrammingExercise5_31 () {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Enter values of deposit amount, annual percentage and months
        System.out.print("Enter initial deposit amount: $");
        double depositAmount = input.nextDouble();

        System.out.print("Enter annual percentage yield: %");
        double annualPercentage = input.nextDouble();

        System.out.print("Enter number of months: ");
        double numberOfMonths = input.nextDouble();

        //
        System.out.println("Months  CD Value");
        for ( int n = 1; n <= numberOfMonths; n++) {
            depositAmount += (depositAmount * (annualPercentage /1200));
            System.out.printf("%-8d%.2f\n", n, depositAmount);
        }
    }   public static void ProgrammingExercise5_21 () {

        Scanner input = new Scanner(System.in);

        //Takes input from user for loan amount & years
        System.out.print("Enter the loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();


        //Prints title of headers
        System.out.println("Interest Rate      Monthly Payment    Total Payment ");

        // Display table with interest rates
        double i = 5.0;

        for (; i <= 8; i += 1.0/8) {

            //Monthly interest rate equation
            double monthlyInterestRate = i / 1200;

            //Equation to calculate monthly payment
            double monthlyPayment = loanAmount * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, years * 12));

            //Prints monthly payment

            System.out.print("%");

            //Prints interest rate with proper spacing
            System.out.printf("%-5.3f", i);

            //Creates space between columns
            System.out.print("              ");

            System.out.printf("%-19.2f", monthlyPayment);

            System.out.printf("%-19.2f\n", (monthlyPayment * 12) * years);
        }
        
    }
        
        public static void ProgrammingExercise5_45() {

        Scanner input = new Scanner(System.in);

        //Asks for user to input 10 numbers
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        System.out.print("Enter fourth number: ");
        double num4 = input.nextDouble();

        System.out.print("Enter fifth number: ");
        double num5 = input.nextDouble();

        System.out.print("Enter sixth number: ");
        double num6 = input.nextDouble();

        System.out.print("Enter seventh number: ");
        double num7 = input.nextDouble();

        System.out.print("Enter eighth number: ");
        double num8 = input.nextDouble();

        System.out.print("Enter ninth number: ");
        double num9 = input.nextDouble();

        System.out.print("Enter tenth number: ");
        double num10 = input.nextDouble();

        //Holds number of inputs
        double numberOfPoints= 10;

        //Calculates the mean of the inputs
        double mean = (num1 + num2 + num3 + num4 + num5
                + num6 + num7 + num8 + num9 + num10) / numberOfPoints ;

        double num1Squared = (num1 - mean);
        double num2Squared = (num2 - mean);
        double num3Squared = (num3 - mean);
        double num4Squared = (num4 - mean);
        double num5Squared = (num5 - mean);
        double num6Squared = (num6 - mean);
        double num7Squared = (num7 - mean);
        double num8Squared = (num8 - mean);
        double num9Squared = (num9 - mean);
        double num10Squared =(num10 - mean);

        //Gets sum of numbers minus the mean squares
        double sum = (num1Squared * num1Squared) + (num2Squared * num2Squared) +
                (num3Squared * num3Squared) + (num4Squared * num4Squared) +
                (num5Squared * num5Squared) + (num6Squared * num6Squared) +
                (num7Squared * num7Squared) + (num8Squared * num8Squared) +
                (num9Squared * num9Squared) + (num10Squared * num10Squared);

        double total = (sum) / (numberOfPoints-1);

        //Calculates standard deviation
        double standardDeviation = Math.pow(total, 0.5);

        //Print the mean and standard deviation
        System.out.println("The mean is " + mean );
        System.out.printf("The standard deviation is "  +"%.5f", standardDeviation);
    }
    
        
        public static void ProgrammingExercise5_47() {
        
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN -13 as a string");

        //This code takes number input from user
        System.out.print("First number: ");
        int d1 = input.nextInt();

        System.out.print("Second number: ");
        int d2 = input.nextInt();

        System.out.print("Third number: ");
        int d3 = input.nextInt();

        System.out.print("Fourth number: ");
        int d4 = input.nextInt();

        System.out.print("Fifth number: ");
        int d5 = input.nextInt();

        System.out.print("Sixth number: ");
        int d6 = input.nextInt();

        System.out.print("Seventh number: ");
        int d7 = input.nextInt();

        System.out.print("Eighth number: ");
        int d8 = input.nextInt();

        System.out.print("Ninth number: ");
        int d9 = input.nextInt();

        System.out.print("Tenth number: ");
        int d10 = input.nextInt();

        System.out.print("Eleventh number: ");
        int d11 = input.nextInt();

        System.out.print("Twelfth number: ");
        int d12 = input.nextInt();

        //This code is the checksum equation
        int checksum = 10 - (d1+ (3*d2) + d3 + (3*d4) + d5 + (3*d6) + d7 +
                (3*d8) + d9 + (3*d10) + d11 + (3*d12))%10;

        //This code converts integers to strings during print out
        String number1 = Integer.toString(d1);
        String number2 = Integer.toString(d2);
        String number3 = Integer.toString(d3);
        String number4 = Integer.toString(d4);
        String number5 = Integer.toString(d5);
        String number6 = Integer.toString(d6);
        String number7 = Integer.toString(d7);
        String number8 = Integer.toString(d8);
        String number9 = Integer.toString(d9);
        String number10 = Integer.toString(d10);
        String number11 = Integer.toString(d11);
        String number12 = Integer.toString(d12);

        //This code verifies if checksum is equal to 10 or not, then prints output
        if (checksum == 10){
            System.out.println("The ISBN-13 number is " + number1+number2+number3+number4+
                    number5+number6+number7+number8+number9+number10+number11+number12+"0");
        } else {
            System.out.println("The ISBN-13 number is " + number1+number2+number3+number4+
                    number5+number6+number7+number8+number9+number10+number11+number12);
            
        }
    }
}
        

        



    
        
    
    
    