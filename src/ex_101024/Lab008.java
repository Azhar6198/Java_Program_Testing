package ex_101024;

public class Lab008 {
    public static void main(String[] args) {


    int decVal = 26;          // Decimal value
    int octVal = 032;            // Octal literal (equal to decimal 26)
    int hexVal = 0x1a;             // Hexadecimal literal (equal to decimal 26)
    int binVal = 0b11010;        // Binary literal (equal to decimal 26)

    // Floating-point literals
    double doubleVal = 643.89;          // Double literal
    float floatVal = 125.35f;          // Float literal

    // Character literal
    char ch = 'A';              // Character literal
    char newline = '\n';        // Escape sequence for newline
    char horTab = '\t';         // Escape sequence for horizontal tab
    char backSpace ='\b';      //Escape sequence for backspace
    char singleQuote = '\'';         //Escape sequence for single quote
    char doubleQuote = '\"';    //Escape sequence for double quote
    // String literals
    String str = "Thanks Pramod Sir!"; // String literal

    // Boolean literals
    boolean isTrue = true;        // Boolean literal
    boolean isFalse = false;      // Boolean literal

    // Null literal
    String nullString = null;     // Null literal

    // Printing the literals
        System.out.println("Integer Literals:");
        System.out.println("==========================================");
        System.out.println("Decimal: " + decVal);
        System.out.println("Octal: " + octVal);
        System.out.println("Hexadecimal: " + hexVal);
        System.out.println("Binary: " + binVal);

        System.out.println("\nFloating-Point Literals:");
        System.out.println("==========================================");
        System.out.println("Double: " + doubleVal);
        System.out.println("Float: " + floatVal);

        System.out.println("\nCharacter Literals:");
        System.out.println("==========================================");
        System.out.println("Character: " + ch);
        System.out.println("Newline character: " + newline + "(This is a new line.)");
        System.out.println("Horizontal tab character: " + horTab + "(This is horizontal tab.)");
        System.out.println("Back space character:"+ backSpace +"Move back.");
        System.out.println("Single quote character: "+ singleQuote + "This is a single quote.");
        System.out.println("Double quote character: "+ doubleQuote + "This is a double quote.");
        System.out.println("\nString Literals:");
        System.out.println("==========================================");
        System.out.println("String: " + str);

        System.out.println("\nBoolean Literals:");
        System.out.println("==========================================");
        System.out.println("True: " + isTrue);
        System.out.println("False: " + isFalse);

        System.out.println("\nNull Literal:");
        System.out.println("==========================================");
        System.out.println(nullString);  // This will print null
}

}
