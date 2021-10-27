import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sales ID: ");
        int sales_id = scanner.nextInt();
        System.out.print("Enter Seller Name: ");
        String seller_name = scanner.next();
        System.out.print("Enter Sales Amount: ");
        float sales_amount = scanner.nextFloat();
        System.out.print("Enter Basic Salary: ");
        float salary = scanner.nextFloat();
        if (sales_amount >=50000 )
        {

            System.out.print("Sales commission is 35%");

        }
        else if(sales_amount <50000 && sales_amount >=30000)
        {
            System.out.print("Sales commission is 20%");
        }
        else if(sales_amount <30000 && sales_amount >=20000)
        {
            System.out.print("Sales commission is 10% ");
        }
        else if (sales_amount <20000 && sales_amount >=10000)
        {
            System.out.print("Sales commission is 5%");

        }
        else{

            System.out.println("Sales commission is 2%");
        }
    }
}
