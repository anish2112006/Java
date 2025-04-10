public class BreakExample {
    public static void main(String[] args) {
        System.out.println("Searching for number 5...");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Number 5 found! Exiting loop.");
                break;
            }
            System.out.println("Checked number: " + i);
        }

        System.out.println("Loop terminated.");
    }
}
