public class ContinueExample {
    public static void main(String[] args) {
        System.out.println("Printing odd numbers between 1 and 10:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("Done.");
    }
}
