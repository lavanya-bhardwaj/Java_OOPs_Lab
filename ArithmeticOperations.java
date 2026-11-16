import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int choice=0;
        double result=0;
        while(choice != 6){
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.println("enter choice: ");
            choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    result = num1+num2;
                    break;
                case 2:
                    result = num1-num2;
                    break;
                case 3:
                    result = num1*num2;
                    break;
                case 4:
                    if(num2 == 0){
                        System.out.println("Zero division error");
                    }
                    else{
                        result = (double) num1/num2;
                    }
                    break;
                case 5:
                    if(num2 == 0){
                        System.out.println("Zero division error");
                    }
                    else{
                        result = num1%num2;
                    }
                    break;
                case 6:
                    System.out.println("exiting");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Result: "+ result);
        }
        scanner.close();
    }
}
