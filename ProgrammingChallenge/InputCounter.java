import java.util.Scanner; 

public class InputCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        System.out.println("Enter your text (leave an empty line to finish):");

        while (true) {
            String inputLine = scanner.nextLine();  

            if (inputLine.isEmpty()) {
                break;
            }

            lineCount++;

            charCount += inputLine.length();

            // Split input line by whitespace to count words
            String[] words = inputLine.split("\\s+");
            wordCount += words.length;
        }

        System.out.println("Total lines entered: " + lineCount);
        System.out.println("Total words entered: " + wordCount);
        System.out.println("Total characters entered: " + charCount);

        scanner.close();
    }
}
