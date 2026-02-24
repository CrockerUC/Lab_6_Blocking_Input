import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        double height = 0.0;
        double width = 0.0;
        boolean done = false;
        String trash;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.println("Enter the height of the rectangle: ");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                if(height > 0) done = true;
                else System.out.println("Invalid input: Height must be greater than zero.");
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
            System.out.println("Enter the width of the rectangle: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                if(width > 0) done = true;
                else System.out.println("Invalid input: Width must be greater than zero.");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a number.");
            }
        }while(!done);

        double area = height * width;
        double perimeter = 2 * (height + width);
        double diagonal = Math.sqrt(height * height + width * width);

        System.out.printf("The area of the rectangle is %.2f\n", area);
        System.out.printf("The perimeter of the rectangle is %.2f\n", perimeter);
        System.out.printf("The diagonal of the rectangle is %.2f\n", diagonal);

        in.close();
    }
}
