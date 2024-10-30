package Oct.ex_301024_Functions;
import java.util.Scanner;
public class Lab118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int a = sc.nextInt();
        System.out.println("Enter num2");
        int b =sc.nextInt();

        int result = sum_of_numbers(a,b);
        System.out.println("Sum is__>"+ result);
    }
    static int sum_of_numbers(int a , int b){
return(a+b);
}
}