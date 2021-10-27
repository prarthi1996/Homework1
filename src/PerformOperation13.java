import java.util.Objects;
import java.util.Scanner;

public class PerformOperation13 {

    public static void main(String[] args) {
        float i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the First number:");
        float number = scanner.nextFloat();
        System.out.print("Please Enter the Second number:");
        float second = scanner.nextFloat();
        System.out.print("Please Enter the character from +,-,*,/ :");
        String character = scanner.next();
        if (Objects.equals(character,"+"))
        {
            i= number + second;
            System.out.println("The addition of " +  number +" and " +  second + " is " + i);
        }
        else if(Objects.equals(character,"-")){
            i=number-second;
            System.out.println("The subtraction of " + number +" and " +  second + " is " + i);
        }
        else if(Objects.equals(character,"*")){
            i=number*second;
            System.out.println("The multiplication of"  + number +" and " +  second + " is " + i);
        }
        else if (Objects.equals(character,"/")){
            i=number/second;
            System.out.println("The division of " + number +" and " + second + " is "+ i);

        }
        else {
            System.out.println("Invalid Character");
        }

    }
}
