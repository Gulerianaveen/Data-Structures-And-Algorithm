import java.util.Scanner;

public class Switch_case_03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for English , 2 for Hindi , 3 for Spanish");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("You choose English");
                break;
            
            case 2:
                System.out.println("You choose Hindi");
                break;
            
            case 3:
                System.out.println("You choose Spanish");
                break;
        
            default:
                System.out.println("Inavlid input");
                break;
        }
    }
}
