package Oct.ex_221024_IF_Condition;
import java.util.Scanner;
public class Lab074 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of side1");
        int side1=sc.nextInt();
        System.out.println("enter length of side2");
        int side2=sc.nextInt();
        System.out.println("enter length of side3");
        int side3=sc.nextInt();
        if(side1==side2 && side2==side3 && side3==side1){
            System.out.println("It's a equilateral traingle");
        }
        else if(side1==side2 || side2==side3 || side3==side1){
            System.out.println("It's a isosceles traingle");
        }
        else{
            System.out.println("It's a scalene traingle");
        }
    }
}