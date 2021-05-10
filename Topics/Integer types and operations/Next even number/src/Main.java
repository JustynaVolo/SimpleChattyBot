import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greater = scanner.nextInt();
        if (greater < 10_000) {
            if (greater % 2 == 0) {
                greater += 2;
            } else {
                greater += 1;
            }
            System.out.println(greater);
        }
    }
}
