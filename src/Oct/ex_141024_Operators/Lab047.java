package Oct.ex_141024;

public class Lab047 {
    public static void main(String[] args) {

        // GST - 18.45
        int course = 100;
        float GST = 18.45f;
        int total_price = course+(int)GST; // Narrowing -> Explicit
        System.out.println(total_price);

    }
}
