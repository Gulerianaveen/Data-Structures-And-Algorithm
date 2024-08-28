import java.util.Scanner;

public class if_Else_if_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();

        if(age<18){
            System.out.println("You are not eligible for driving license");
        }
        else{
            System.out.println("You are eligible for driving license");
        }
    }
}