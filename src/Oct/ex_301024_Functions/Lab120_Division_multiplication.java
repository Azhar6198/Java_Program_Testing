package Oct.ex_301024_Functions;
import java.util.Scanner;
public class Lab120_Division_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int a = sc.nextInt();
        System.out.println("Enter the number2");
        int b = sc.nextInt();

        int result = multiplication_of_two_numbers(a,b);
        System.out.println("Multiplication of two numbers is "+ " " +result);

        int result2 = Division_of_two_numbers(a,b);
        System.out.println("Div of two numbers is" + " " +result2);


    }
    static int multiplication_of_two_numbers(int a , int b){
        return(a*b);
    }
    static int Division_of_two_numbers(int a , int b){
        return(a/b);
    }
}
