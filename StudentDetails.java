import java.util.Scanner;
class Student{
    String name;
    int age;
}
public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter your name : ");
        
        s1.name = scanner.nextLine();
        System.out.println("hello "+s1.name);

        scanner.close();
    }
}
