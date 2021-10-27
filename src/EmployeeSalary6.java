import java.util.Scanner;

public class EmployeeSalary6 {
    public static void main(String[] args) {
        double da,ta,pf, gsalary;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        String name = scanner.next();
        System.out.print("Enter Basic Salary: ");
        float salary = scanner.nextFloat();
        double hra = (salary * 0.10);
        System.out.println("The amount of HRA is "+ hra);
        da = (salary*0.08);
        System.out.println("The amount of DA is " + da);
        ta=(salary*0.09);
        System.out.println("The amount of TA is " + ta);
        pf=(salary*0.20);
        System.out.println("The amount of PF is " + pf);
        gsalary= hra+da+ta+pf;
        System.out.println("Gross Salary of " + name + " is " + gsalary);



    }
}
