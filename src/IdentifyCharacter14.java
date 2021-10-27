import java.util.Scanner;

public class IdentifyCharacter14 {
    public static void main(String[ ] arg)
    {
        //int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=sc.next( ).charAt(0);
        if(ch >= '0' && ch <= '9')
        {
            System.out.println(ch + " is a number");
        }
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println(ch + " is an alphabet");
        else
            System.out.println(ch + " is a special character");
    }
}
