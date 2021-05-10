import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        String cityInUpper = city.toUpperCase();
        boolean withJ = cityInUpper.startsWith("J");
        System.out.println(withJ);    }
}