import java.util.Scanner;


public class BMI_Calculator {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Weight in lbs: ");
        double weight = input.nextDouble();
        System.out.print("Feet: ");
        double feet  = input.nextDouble();
        System.out.print("Inches: ");
        double inches  = input.nextDouble();
        double BMI = weight / Math.pow((feet * 12 + inches), 2)*(703);
        if (BMI <= 24.9) {
            System.out.println("Underweight");


            

            }
        }


    }
