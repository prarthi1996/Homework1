import java.util.Scanner;

public class LeapYear2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to test : ");
        int number = scanner.nextInt();
        if((number%4==0)&&(number%100!=0)||(number%400==0))
        {
            System.out.println(number + " is a Leap Year");
        }
        else
        {
            System.out.println(number + " is not a Leap Year");
        }
    }
}
