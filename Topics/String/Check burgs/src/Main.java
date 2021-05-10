import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
            boolean withBurg = city.endsWith("burg");
            System.out.println(withBurg);



    }
}