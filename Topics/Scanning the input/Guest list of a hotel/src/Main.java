

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner room = new Scanner(System.in);
        int i = 0;
        String[] people = new String[9];

        while (room.hasNext()) {
            people[i++] = room.next();
        }
        while (i>0){
            System.out.println(people[--i]);
        }
    }
}