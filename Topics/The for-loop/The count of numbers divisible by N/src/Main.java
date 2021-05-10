import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        int r = 0;
       // System.out.println(a +"\t" + b +"\t" + n);
            if (a<b)
            { for( ; b >= a; r++){
                b = b - n;

            }System.out.println(r);
        }}
}