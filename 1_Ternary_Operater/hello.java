import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter First number :");
        int num1=input.nextInt();

        System.out.print("Please Enter Second number :");
        int num2=input.nextInt();

        if(num1>num2){
            System.out.println("Num1 is Gretest");
        }else{
            System.out.println("Num2 is Gretest");
        }
    }

}