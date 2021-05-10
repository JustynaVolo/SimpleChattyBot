import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean first = n > 0;
        boolean second = n2 > 0;
        boolean third = n3 > 0;
        boolean result = (first && !second && !third)
                || (!first && second && !third)
                || (!first && !second && third);

        System.out.println(result);

    }
}