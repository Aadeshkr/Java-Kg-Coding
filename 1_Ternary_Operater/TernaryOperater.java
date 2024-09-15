import java.util.Scanner;

public class TernaryOperater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The First number :");
        int num1=input.nextInt();

        System.out.print("Please Enter The Second number :");
        int num2=input.nextInt();

        int gNum=num1>num2 ? num1:num2;
        System.out.println(gNum+" is Gretest number ");


        
    }
    
}
