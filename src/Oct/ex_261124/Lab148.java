package Oct.ex_261124;
import java.util.Scanner;
public class Lab148 {
    public static void main(String[] args) {
        //*
        //**
        //***
        //****
        //*****

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n=5");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}