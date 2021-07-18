import java.util.Scanner;
public class Main {
public static void main(String[] args) {
System.out.println("MaqOwais is starting JAVA in the name of ALLAH");

Scanner input = new Scanner(System.in);

System.out.println("Enter the first name :");
String first_name = input.next();

System.out.println("Enter the middle name : ");
String middle_name = input.next();

System.out.println("Enter the last name : ");
String lastname = input.next();

System.out.println("your full \"NAME\" is : "+ first_name.concat(middle_name).concat(lastname));
input.close();
}
}
