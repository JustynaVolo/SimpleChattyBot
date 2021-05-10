import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           /* int group = scanner.nextInt();
            int group2 = scanner.nextInt();
            int group3 = scanner.nextInt();
            int class1;
            int class2;
            int class3;
            if ( group % 2 == 0) {
                class1 = group / 2;
            } else {
                class1 = (group + 1) / 2;
            }
            if ( group2 % 2 == 0) {
                class2 = group2 / 2;
            } else {
                class2 = (group2 + 1) / 2;
            }
            if ( group3 % 2 == 0) {
                class3 = group3 / 2;
            } else {
                class3 = (group3 + 1) / 2;
            }
            int sum = class1 + class2 + class3;
        System.out.println(sum);*/
            int a, sum = 0;
            for (int i=0; i<3; i++) {
                int group = scanner.nextInt();
                if (group % 2 == 0) {
                    a = group / 2;
                } else {
                    a = (group / 2) + 1;
                }
                sum = sum + a;
            }
            System.out.println( sum );
    }
}