package Oct.ex_151024_Nested_Ternary_Operator;

public class Lab053 {
    public static void main(String[] args) {
        int score = 85;
        String Grade = (score >= 90) ? "A": (score >= 80) ? "B" : (score>=60) ? "C":"F";
        System.out.println("Your grade is -->" + Grade);
        System.out.println("Your grade is %s, Grade");
    }

}
