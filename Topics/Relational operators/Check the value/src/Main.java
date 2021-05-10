import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if ((value > 0) && (value<10))
        {
            boolean results = true;
            System.out.println(results);
            
        } else
        System.out.println (false);
    }
}
