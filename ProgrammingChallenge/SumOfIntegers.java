import java.util.Scanner;

public class SumOfIntegers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        
        System.out.println("Enter integers to sum them. Press 'Enter' after each number.");
        System.out.println("The program will keep summing the numbers as long as you keep entering integers.");

   
        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine().trim();  

           
            if (input.isEmpty()) {
                break;
            }

            try {
              
                int number = Integer.parseInt(input);

             
                sum += number;

       
                System.out.println("Current sum: " + sum);

            } catch (NumberFormatException e) {
            
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        System.out.println("The final total sum is: " + sum);

        scanner.close();
    }
}
