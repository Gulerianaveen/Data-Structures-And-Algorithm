import java.util.Scanner;

public class Even_odd_02 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a number");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
