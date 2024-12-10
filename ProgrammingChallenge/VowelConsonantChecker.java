import java.util.Scanner;

public class VowelConsonantChecker {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();  

      
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);  

         
            char lowerCh = Character.toLowerCase(ch);

           
            if (Character.isLetter(ch)) {
              
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant.");
                }
            } else {
                System.out.println(ch + " is not an alphabetic character.");
            }
        }

        scanner.close();
    }
}


