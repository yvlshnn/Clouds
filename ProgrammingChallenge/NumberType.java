import java.util.Scanner;

public class NumberType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("The number is zero.");
        } else {
    
            if (number > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is negative.");
            }

            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }

        scanner.close();
    }
}
