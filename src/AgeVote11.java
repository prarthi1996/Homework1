import java.util.Scanner;

public class AgeVote11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please Enter the number:");
        int number = scanner.nextInt();
        if(number>=18)
        {
            System.out.println("The age is eligible to Vote");
        }
        //else if(number<0)
        //{
            //System.out.println(number+ "is a Negative number");
        //}
        else
        {
            System.out.println("The age is not eligible to Vote");
        }
    }
}
