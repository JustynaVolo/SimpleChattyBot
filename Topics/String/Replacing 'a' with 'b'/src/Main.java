import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String strWithoutA = str.replace("a", "b");
                System.out.println(strWithoutA);
    }
}