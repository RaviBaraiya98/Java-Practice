import java.util.Scanner;

public class practical24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer (x): ");
            int x = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the second integer (y): ");
            int y = Integer.parseInt(scanner.nextLine());

            int result = x / y; 
            System.out.println("Result of " + x + " / " + y + " = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
    }
}


