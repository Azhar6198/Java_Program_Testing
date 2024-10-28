package Oct.ex_271024_While;

public class Lab107 {
    public static void main(String[] args) {
        String arg_age_string = args[0];
        int age = Integer.parseInt(arg_age_string);
        while (age > 0) {
            System.out.println(age);
            age--;
        }
    }
}
