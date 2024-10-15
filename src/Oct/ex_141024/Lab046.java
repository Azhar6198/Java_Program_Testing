package Oct.ex_141024;

public class Lab046 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //
        // short s = phone_no; // Implict - JVM
        short s = (short)phone_no; // Explicit - User - Loss that data
        System.out.println(phone_no);
        System.out.println(s); // Explicit - User - Loss that data
}}