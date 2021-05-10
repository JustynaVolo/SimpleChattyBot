import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for (int i = 1; i <= 1000; i++) {
            int equation = (a * i * i * i) + (b * i * i) + (c * i) + d;
            if (equation == 0) {
                System.out.println(i);
            }
        }
    }
}