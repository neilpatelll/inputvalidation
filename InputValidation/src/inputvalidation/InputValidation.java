import java.util.Scanner;

public class InputValidation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int value; 
        do
        {
            System.out.print("Enter an integer < 100: ");
            value = in.nextInt();
        }
        while (value >= 100);

        System.out.println("Thank you for entering " + value);
    }
}



