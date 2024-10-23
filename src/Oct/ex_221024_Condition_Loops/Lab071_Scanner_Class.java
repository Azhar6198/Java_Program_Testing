package Oct.ex_221024_Condition_Loops;
import java.util.Scanner;
public class Lab071_Scanner_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Age");
        int age =scanner.nextInt();
        System.out.println(age>=25? "allowed to go":"not allowed");
    }

}
