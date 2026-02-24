import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double mpg = 0.0;
        double costPerGallon = 0.0;
        double tankSize = 0.0;
        boolean done = false;
        String trash;
        do
        {
            System.out.println("Enter the miles per gallon: ");
            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                if(mpg > 0) done = true;
                else System.out.println("Invalid input: MPG must be greater than zero.");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a number.");
            }
        }while(!done);

        done = false;
        do
        {
            System.out.println("Enter the cost per gallon: ");
            if(in.hasNextDouble())
            {
                costPerGallon = in.nextDouble();
                in.nextLine();
                if(costPerGallon > 0) done = true;
                else System.out.println("Invalid input: Cost per gallon must be greater than zero.");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a number.");
            }
        }while(!done);

        done = false;
        do {
            System.out.println("Enter the tank size in gallons: ");
            if(in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine();
                if(tankSize > 0) done = true;
                else System.out.println("Invalid input: Tank size must be greater than zero.");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a number.");
            }
        }while(!done);

        double costToDrive100Miles = (100.0 / mpg) * costPerGallon;
        double distanceFullTank = tankSize * mpg;

        System.out.printf("The cost to drive 100 miles is $%.2f\n", costToDrive100Miles);
        System.out.printf("The car can travel %.2f miles on a full tank.\n", distanceFullTank);

        in.close();
    }
}
