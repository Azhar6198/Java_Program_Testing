package Oct.ex_301024_Functions;
import java.util.Scanner;
public class Lab119_Sub_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = sc.nextInt();
        System.out.println("Enter the num2");
        int b = sc.nextInt();


        int result = sub_of_two_numbers( a,b);
        System.out.println("sub of two numbers" + " "+ result);
    }
    static int sub_of_two_numbers(int a ,int b){
        return(a-b);
    }
}
