import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();
        System.out.println("Length of the string: " + length);

        String upperCase = input.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        String lowerCase = input.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        char firstChar = input.charAt(0);
        System.out.println("First character: " + firstChar);

        char lastChar = input.charAt(length - 1);
        System.out.println("Last character: " + lastChar);

        if (length >= 5) {
            String substring = input.substring(1, 5);  
            System.out.println("Substring from 2nd to 5th character: " + substring);
        } else {
            System.out.println("String is too short to extract substring from 2nd to 5th character.");
        }
        scanner.close();
    }
}
