package Oct.ex_291024_Functions;
import java.util.Scanner;
public class Task02 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number to Reverse = ");
            int num = sc.nextInt();
            int rev=0;
            int rem=0;

            for (int i= num; num >=1 ;  )
            {

                rem = num % 10 ;

                rev = rev*10 + rem;

                num = num/10 ;
            }
            System.out.println("Reversed Output =" + rev);

            sc.close();
        }}
