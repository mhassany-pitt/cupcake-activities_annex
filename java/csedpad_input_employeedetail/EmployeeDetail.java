import java.util.Scanner;
public class EmployeeDetail {
      public static void main(String[] args) {
            //Create a new Scanner object to get the input from the user, where user is an employee
            Scanner empDetails = new Scanner(System.in);
            //Prompt user to input their name, age and salary
            System.out.println("Enter Name, Position, Age and Salary");
            String name = empDetails.nextLine();
            String position = empDetails.nextLine();
            int age = empDetails.nextInt();
            double salary = empDetails.nextDouble();
            //Prompt user to input True or False for the given question
            System.out.println("Are you permanent employee? (True or False)");
            boolean bn = empDetails.nextBoolean();
            System.out.println("Following are the details that you have provided!!")
            System.out.println("Name: " + name);
            System.out.println("Position: " + position);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Permanent Contract " + bn);
      }
}