import java.util.Scanner;
import java.util.Random;

public class guessingGame {

    public static void main(String args[]){

        int count = 5;

        // Storing the random number 
        Random rand = new Random();
        int value = rand.nextInt(50);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the guessing Game");
        System.out.println("Guess a number between 0 and 50 \n You only have 5 chances"); 

        //
        for(int i=0; i<5; i++){

            
            int guess = sc.nextInt();

            if(guess==value){

                System.out.println("Viola.. You Guessed Correctly");
                break;

            }
            else{
                
                System.out.println("Wrong guess..\n Only "+ (--count) +" guesses remaining!!");

                if(guess<value){
                    System.out.println("Guess a higher value");
                }
                else{
                    System.out.println("Guess a lower value");
                }

                if(count==0)
                    System.out.println("Value was : "+value);
                    
            }
            
        }
        sc.close();

    }
    
}
