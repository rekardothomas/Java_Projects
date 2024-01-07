import java.util.*;
public class Chapter4And7{
public static void programmingExercise4_5(){
    
     Scanner input = new Scanner(System.in);

        //This code takes input of number of sides
        System.out.print("Enter the number of sides: ");
        double numberOfSides = input.nextDouble();

        //This code takes the side
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        //This equation calculates the area
        double area  = (numberOfSides * (side*side)) / (4 * (Math.tan(Math.PI/numberOfSides)));

        //Prints output
        System.out.print("The area of the polygon is " + area);
}
    
    public static void programmingExercise4_23() {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter Name: ");
        String name = input.nextLine();


        System.out.print("Enter Number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();


        System.out.print("Enter Number of hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalWithholding = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateWithholding = input.nextDouble();

        double grossPay = hoursWorked * hourlyPayRate;

        double fHolding = federalWithholding*grossPay;
        double sHolding = stateWithholding*grossPay;
        double totalDeduction = fHolding+sHolding;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyPayRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: ");
        System.out.println("Federal Withholding: " + (grossPay*federalWithholding));
        System.out.println("State Withholding: " + (grossPay*stateWithholding));
        System.out.println("Total Deductions: " + totalDeduction);
        System.out.print("Net Pay: " );
        System.out.printf("%.2f",(grossPay-((grossPay*federalWithholding)
                                            +(grossPay*stateWithholding) )));
    
    }
     public static void programmingExercise4_25() {

        //Prompts license plate
        Random rnd = new Random();
        System.out.print("License Plate: ");

        //This code gives the  three letter to the license plate
        for (int i = 1; i <= 3; i++) {
            char letter = (char) ('A' + rnd.nextInt(26));
            System.out.print(letter);
        }

        //This code gives the four numbers to the license plate
        for (int n = 1; n <=4; n++){
        int numbers = (int)(Math.random() * 9);
        System.out.print(numbers);
        }
     }
        public static void programmingExercise7_11 (){

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
        System.out.printf("The mean is " + "%.2f\n",  mean);
        System.out.printf("The standard deviation is "  +"%.5f", standardDeviation);
}
    
}

    
    

