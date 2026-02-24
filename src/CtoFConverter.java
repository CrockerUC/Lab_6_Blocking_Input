import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        double celsius = 0.0;
        double fahrenheit;
        boolean done = false;
        String trash = "";
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a number.");
            }
        }while(!done);
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
        in.close();
    }
}
