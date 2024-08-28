import java.util.Scanner;

public class if_Else_if_01 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        System.out.println("Did you pass the test");
        boolean test_pass = sc.nextBoolean();

        if(age<18){
            System.out.println("You are not eligible for driving license");
        }
        else if (age>=18&&test_pass==true) {
            System.out.println("You are eligible for driving license");
            
        }
        else{
            System.out.println("You are not eligble");
        }
    }
}