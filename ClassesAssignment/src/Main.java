import java.sql.SQLOutput;

class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public int salary;

    public Employee(int startingId, String startingFirstName, String startingLastName, int startingSalary) {
        firstName = startingFirstName;
        lastName = startingLastName;
        id = startingId;
        salary = startingSalary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return (firstName + " " + lastName);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(int percent) {
        salary = (int) (salary * (1 + (percent * 0.01)));
    }



    public String tostring() {
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }



}

public class Main {
    public static void main(String[] args) {
        Employee test = new Employee(1, "Bob", "S", 1);

        System.out.println("ID: " + test.getID());
        System.out.println("First Name: " + test.getFirstName());
        System.out.println("Last Name: " + test.getLastName());
        System.out.println("Full Name: " + test.getName());
        System.out.println("Salary: " + test.getSalary());;
        test.setSalary(123);
        System.out.println("Set Salary to " + test.getSalary());
        System.out.println(test.tostring());



    }
}
