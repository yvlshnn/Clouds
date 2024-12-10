import java.util.Scanner;

public class PalindromeString {

    public String checkPalindrome(String word) {
        String revString = "";
    
        for (int y = word.length() - 1; y >= 0; y--) {
            revString += word.charAt(y);  
            System.out.println(revString);  
        }

        return (revString.equals(word)) ? "Palindrome" : "Not Palindrome";
    }

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a word or phrase: ");
        String word = scanner.nextLine();  

   
        String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

      
        PalindromeString ps = new PalindromeString();
        
        String result = ps.checkPalindrome(cleanedWord);
        System.out.println("Final result: " + result);  

        scanner.close();
    }
}
 