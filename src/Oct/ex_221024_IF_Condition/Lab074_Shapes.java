package Oct.ex_221024_IF_Condition;
import java.util.Scanner;
public class Lab074_Shapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of side1");
        double side1=sc.nextDouble();
        System.out.println("enter length of side2");
        double side2=sc.nextDouble();
        System.out.println("enter length of side3");
        double side3=sc.nextDouble();
        if(side1<=0 || side2<=0 || side3<=0){
            System.out.println("Not Valid, values should not be negative in this case");
        }        if(side1==side2 && side2==side3 && side3==side1){
            System.out.println("It's a equilateral traingle");
        }
        else if(side1==side2 || side2==side3 || side3==side1){
            System.out.println("It's a isosceles traingle");
        }
        else {
            System.out.println("It's a scalene traingle");
        }

        sc.close();
    }
}
