import java.util.Scanner;

public class Average7 {
    public static void main(String[] args) {
        float total;
        double average;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float first = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float second = scanner.nextFloat();
        System.out.print("Enter third number: ");
        float third = scanner.nextFloat();
        System.out.print("Enter fourth number: ");
        float fourth = scanner.nextFloat();
        System.out.print("Enter fifth number: ");
        float fifth = scanner.nextFloat();
        total = first + second + third + fourth + fifth;
        //System.out.println("Total marks of Student is:" + total);
        average = (total / 5);
        System.out.println("The average of all entered numbers is" + average);
    }
}
