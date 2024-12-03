package Nov.ex_031224_oops;

public class Lab150 {
    public static void main(String[] args) {
        Car tesla = new Car();
        System.out.println(tesla.year);
        System.out.println(tesla.name);
        System.out.println(tesla.model);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);


    }
}
