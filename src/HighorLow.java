import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;
        String trash;

        do
        {
            System.out.println("Guess a number between 1 and 10: ");
            if(in.hasNextInt())
            {
                guess = in.nextInt();
                in.nextLine();
                if(guess >= 1 && guess <= 10) done = true;
                else System.out.println("Invalid input: Please enter an integer between 1 and 10.");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter an integer.");
            }
        }while(!done);

        System.out.println("The number was " + randomNumber + ".");
        if(guess < randomNumber) System.out.println("Your guess is too low.");
        else if(guess > randomNumber) System.out.println("Your guess is too high.");
        else System.out.println("You guessed correctly!");

        in.close();
    }
}
