import java.util.Scanner;

public class StudentResult3 {

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
        total = english+maths+science+hindi+computer;
        System.out.println("Total marks of Student is:" + total);
        average= (total/5);
        // System.out.println(average);
        percentage=(total/500.0)*100;
      System.out.println("Percentage of Student is " + percentage);

        if (percentage >= 80)
        {

          System.out.print("Grade of Student is A+");

      }
        else if(percentage <80 && percentage >=60)
        {
          System.out.print("Grade of Student is A");
        }
        else if(percentage <60 && percentage >=50)
        {
          System.out.print("Grade of Student is B+ ");
        }
        else
        {
          System.out.print("Grade of Student is c");

      }




    }
}
