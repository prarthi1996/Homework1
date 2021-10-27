import java.util.Scanner;

public class TernaryOperator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to test :");
        int number = scanner.nextInt();

        String result= number%2==0 ?"Even":"Odd";
        System.out.println(number + " is " + result);
    }

}
