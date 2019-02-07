import java.util.Scanner;

public class TextMsgExpander {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userLine;

        // Prompt user for text
        System.out.println("Enter text:");
        userLine = scnr.nextLine();
        System.out.println("You entered: " + userLine);
        System.out.println("");

        // Check for abbreviations
        userLine = userLine.replace("BFF", "best friend forever");
        userLine = userLine.replace("IDK", "I don't know");
        userLine = userLine.replace("JK", "just kidding");
        userLine = userLine.replace("TMI", "too much information");
        userLine = userLine.replace("TTYL", "talk to you later");

        // Output expanded text
        System.out.println("");
        System.out.println("Expanded: " + userLine);
    }
}