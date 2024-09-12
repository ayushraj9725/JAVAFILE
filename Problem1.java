import java.util.Scanner;

/*
 * Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.



1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.
 */

public class Problem1 {

    public static int classifyCharacter(char ch) {
        if (Character.isUpperCase(ch)) {
            return 1;
        } else if (Character.isLowerCase(ch)) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();

        // Check if exactly one character is entered
        if (input.length() != 1) {
            System.out.println("Error: Please enter exactly one character.");
            scanner.close();
            return;
        }

        char ch = input.charAt(0);
        int result = classifyCharacter(ch);

        // Print the result based on the classification
        System.out.println(result);

        scanner.close();
    }
}

/* second code
 * 
 * import java.util.Scanner;

public class CharacterClassifier {

    public static int classifyCharacter(char ch) {
        // Get ASCII value of the character
        int ascii = (int) ch;

        // Check if it's an uppercase letter
        if (ascii >= 65 && ascii <= 90) { // ASCII values for 'A' to 'Z'
            return 1;
        } 
        // Check if it's a lowercase letter
        else if (ascii >= 97 && ascii <= 122) { // ASCII values for 'a' to 'z'
            return 0;
        } 
        // Character is not an alphabet
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();

        // Check if exactly one character is entered
        if (input.length() != 1) {
            System.out.println("Error: Please enter exactly one character.");
            scanner.close();
            return;
        }

        char ch = input.charAt(0);
        int result = classifyCharacter(ch);

        // Print the result based on the classification
        System.out.println(result);

        scanner.close();
    }
}

 */