import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.println("Details: ");
        System.out.println("Name : "+ name+ "\nAge: "+age+"\nCGPA: "+cgpa);


        scanner.close();
    }
}
