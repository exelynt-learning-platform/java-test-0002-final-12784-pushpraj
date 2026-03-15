public class PalindromePattern {
    public static void main(String[] args) {
        final int PATTERN_HEIGHT = 5;

        for (int i = 1; i <= PATTERN_HEIGHT; i++) {

            for (int j = i; j < PATTERN_HEIGHT; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
