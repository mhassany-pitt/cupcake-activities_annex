class Employee {
  public void work() {
    System.out.println("I am an employee.");
  }
}

class Manager extends Employee {
  public void work() {
    System.out.println("I am a manager.");
  }

  public void manage() {
    System.out.println("Managing ...");
  }
}

public class PolymorphismTest {
  public static void main(String[] args) {
    Employee employee = new Manager();    
    System.out.println(employee.getClass().getName());    
    employee.work();
    employee.manage();
    Manager manager = (Manager) employee;
    manager.work();
    manager.manage();
  }
}