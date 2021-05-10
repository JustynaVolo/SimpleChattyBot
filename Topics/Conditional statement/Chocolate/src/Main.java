import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int rectangle = n * m;
        if (rectangle > k) {
            int difference = rectangle - k;
            if ((k == n) || (k == m)) {
                System.out.println("YES");
            } else if (difference % n == 0) {
                System.out.println("YES");
            } else if (difference % m == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

}

