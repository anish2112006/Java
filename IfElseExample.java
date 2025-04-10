import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        
        if (marks >= 50) {
            System.out.println("Congratulations! You passed the exam.");
        } else {
            System.out.println("Sorry! You failed the exam.");
        }

        scanner.close();
    }
}
