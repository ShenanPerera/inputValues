import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    String name;
    int age;
    float salary;

    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter name : ");
    name = myScanner.next();
    System.out.print("Enter age : ");
    age = myScanner.nextInt();
    System.out.print("Enter salary : ");
    salary = myScanner.nextFloat();

    System.out.print("Name = " + name + "\n" + "Age = " + age + "\n" + "Salary = " + salary);
  }
}