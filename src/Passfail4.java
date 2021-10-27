import java.util.Scanner;

public class Passfail4 {
    public static void main(String[] args) {
        float total;
        double percentage;
        double average;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Marks of English: ");
        float english = scanner.nextFloat();
        System.out.print("Enter the Marks of Maths: ");
        float maths = scanner.nextFloat();
        System.out.print("Enter the Marks of Science: ");
        float science = scanner.nextFloat();
        System.out.print("Enter the Marks of Hindi: ");
        float hindi = scanner.nextFloat();
        System.out.print("Enter the Marks of Computer: ");
        float computer = scanner.nextFloat();

        if ((english>=35) &&(maths>=35) && (science>=35) && (maths>=35) && (hindi>=35) && (computer>=35)){
            System.out.println("The Student result is pass");
        }
        else {

            System.out.println("The Student result is fail");
        }
    }
}
