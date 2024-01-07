/**

 
 This code displays output for best option based on price/lb.

 */


import java.util.Scanner;

public class Financial_Cost {
    public static void main(String[] args) {

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
        } else if (package1_total == package2_total) {
            System.out.println("Packages are the same.");

        }


    }
}
