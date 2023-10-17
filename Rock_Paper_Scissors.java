//Rekardo Thomas CIS 144 Rock, Paper, Scissors.
import java.util.*;
import java.lang.*;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to Rock, Paper, Scissors!");

            try {
                Thread.sleep(2800);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }


            System.out.println("Press 1 for Paper, 2 for Scissors and 3 for Rock.");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Ready?");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Let's Begin!");
            try {
                Thread.sleep(2550);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        while (true) {
            System.out.print("(1)Paper, (2) Scissors, (3) Rock : ");
            int userChoice = input.nextInt();
            if (userChoice >= 4){
                System.out.println( userChoice + " is invalid.");

            }

            // Prints the choice of the user

            if (userChoice == 3)
                System.out.println("You chose Rock.");
            else if (userChoice == 2)
                System.out.println("You chose Scissors.");
            else if (userChoice == 1)
                System.out.println("You chose Paper.");
            //else
                //System.out.print("Choose 1 for paper, 2 for scissors, 3 for rock");


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
                break;
            }
        }
    }
}