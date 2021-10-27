import java.util.Objects;
import java.util.Scanner;

public class CityName10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Alphabet between a-f: ");
        String alphabet = scanner.nextLine();
        if(Objects.equals(alphabet, "a")){
            System.out.println("Amritsar");
        }
        else if(Objects.equals(alphabet, "b")){
            System.out.println("Bhavnagar");
        }
        else if (Objects.equals(alphabet, "c")){
            System.out.println("Chennai");
        }
        else if (Objects.equals(alphabet, "d")){
            System.out.println("Delhi");
        }
        else if(Objects.equals(alphabet, "e")){
            System.out.println("Eepuru");
        }
        else if(Objects.equals(alphabet, "f")){
            System.out.println("Firozpur");
        }
        else {
            System.out.println("Please Enter a Valid Alphabet in range");
        }
    }
}
