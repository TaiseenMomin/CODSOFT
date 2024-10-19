import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rdm=new Random();
        int numberToGuess=rdm.nextInt(100);

        Scanner sc=new Scanner(System.in);
        int userGuess=0;
        int noOfGuesses=0;
        int Limit=10;

        while(userGuess!=numberToGuess){
            noOfGuesses++;
            if(noOfGuesses>Limit){
                System.out.println("OOPS SORRY! You Have Reached The Limit!...");
                break;
            }
            System.out.println("Guess a Number Between 0 to 100");
            userGuess=sc.nextInt();

            if(userGuess<numberToGuess){
                System.out.println("Guessed Number is Low , Try Again...");
            }else if(userGuess>numberToGuess){
                System.out.println("Guessed Number is High, Try Again...");
            }else{
                System.out.println("CONGRATULATIONS!!! You Guessed it Correct in " + noOfGuesses + " Attempts");
                int Score=Limit-noOfGuesses;
                System.out.println("Your Score is : " +Score);
            }
        }

    }
}