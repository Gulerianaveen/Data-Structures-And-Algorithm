import java.util.Scanner;

public class practice_Problem_01 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the operation to be performed");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+':
                int sum = num1+num2;
                System.out.println(sum);
                break;
            
            case '-':
                int difference = num1-num2;
                System.out.println(difference);
                break;
            
            case '*':
                int product = num1*num2;
                System.out.println(product);
                break;

            case '/':
                int dividend = num1/num2;
                System.out.println(dividend);
                break;

            case '%':
                int remainder = num1%num2;
                System.out.println(remainder);
                break;

            default:
                System.out.println("Wrong input");
                break;
        }

    }
}
