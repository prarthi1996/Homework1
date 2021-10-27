import java.util.Scanner;

public class PositiveNegativeZero8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please Enter the number:");
        int number = scanner.nextInt();
        if(number>0)
        {
            System.out.println(number+ " is a Positive number");
        }
        else if(number<0)
        {
            System.out.println(number+ "is a Negative number");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
}
