package Oct.ex_281024_Functions;

public class Lab114 {
    public static void main(String[] args) {


    greet();


    //  2. Without Parameters but With Return Type
   String returned_value = greet_with_hello();
        System.out.println(returned_value);
       greet_with_hello();

    int voting_age = age_of_vote();
        System.out.println(voting_age);
        if (voting_age >= 18) {
        System.out.println("You are allowed to vote!");
    } else {
        System.out.println("Not Allowed!");
    }


    //  3. With Parameters and Without Return Type ( 90%)

    greet_with_your_name("Aydin");
    greet_with_your_name("AZHAR");
    greet_with_your_name("Nisha");

    // greet_with_your_name();

    greet_with_first_name_last_name("azhar","aydin");



    //  4. With Parameters and With Return Type
    int result = sum_of_two_number(3,4);
        System.out.println(result);



}

// 1. Without Parameters and Without Return Type. (Declare) /Define
static void greet() {
    System.out.println("Hi, How are you?");
}

//  2. Without Parameters but With Return Type
static String greet_with_hello() {
    // Write the code
    System.out.println("Hi, I am Type 2");
    return "Hi,You are awesome";
}

static int age_of_vote() {
    // Write the code
    System.out.println("Vote age Returned!");
    return 18;
}


//  3. With Parameters and Without Return Type (void)
static void greet_with_your_name(String name) {
    System.out.println("Hi Your name is " + name);
}

static void greet_with_first_name_last_name(String firstname,String lastname) {
    System.out.println("Hi Your name is " + firstname +" "+ lastname);
}


//  4. With Parameters and With Return Type
static int sum_of_two_number(int a, int b){
    return a+b;
}

}
