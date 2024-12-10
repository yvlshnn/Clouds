import java.util.Scanner;

class StringBuilderOperations {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of at least 10 characters: ");
        String input = scanner.nextLine();

        if (input.length() < 10) {
            System.out.println("Error: The string must be at least 10 characters long.");
            scanner.close();
            return; 
        }

        StringBuilder sb = new StringBuilder(input);

        System.out.println("Length of the string: " + sb.length());

        System.out.println("First character: " + sb.charAt(0));

        System.out.println("Last character: " + sb.charAt(sb.length() - 1));

        int indexOfA = sb.indexOf("a");
        if (indexOfA != -1) {
            System.out.println("First occurrence of 'a' is at index: " + indexOfA);
        } else {
            System.out.println("'a' is not present in the string.");
        }

        String substring = sb.substring(3, 7); 
        System.out.println("Substring from index 3 to 6: " + substring);

        sb.append("123");
        System.out.println("After appending '123': " + sb);

        sb.insert(4, "xyz");
        System.out.println("After inserting 'xyz' at index 4: " + sb);

        sb.delete(2, 4); 
        System.out.println("After deleting substring from index 2 to 4: " + sb);

        sb.deleteCharAt(8);
        System.out.println("After deleting character at index 8: " + sb);

        sb.reverse();
        System.out.println("Reversed string: " + sb);

      
        scanner.close();
    }
}
