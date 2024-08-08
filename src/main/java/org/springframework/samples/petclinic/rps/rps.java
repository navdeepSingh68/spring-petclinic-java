package org.springframework.samples.petclinic.rps;

//Add java code for mini game Rock Paper Scissors
//Capture the user input and randomly generate the computer's choice
//Compare the choices and determine the winner
//Print the result
//Ask user do you want to play again
//If yes, repeat the game
//If no, print the number of games played and the number of games won by the user
//exit the game


import java.util.Scanner;
import java.util.Random;


public class rps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int userChoice;
        int computerChoice;
        int gamesPlayed = 0;
        int gamesWon = 0;
        String playAgain = "y";

        while (playAgain.equals("y")) {
            System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors");
            userChoice = sc.nextInt();
            computerChoice = rand.nextInt(3) + 1;

            if (userChoice == 1) {
                System.out.println("You chose Rock");
            } else if (userChoice == 2) {
                System.out.println("You chose Paper");
            } else if (userChoice == 3) {
                System.out.println("You chose Scissors");
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }

            if (computerChoice == 1) {
                System.out.println("Computer chose Rock");
            } else if (computerChoice == 2) {
                System.out.println("Computer chose Paper");
            } else if (computerChoice == 3) {
                System.out.println("Computer chose Scissors");
            }

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1)
                    || (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
                gamesWon++;
            } else {
                System.out.println("Computer wins!");
            }

            gamesPlayed++;
            System.out.println("Do you want to play again? (y/n)");
            playAgain = sc.next();
        }

        System.out.println("Number of games played: " + gamesPlayed);
        System.out.println("Number of games won: " + gamesWon);
        sc.close();
    }
}
