package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task11 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /* task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz

        a->7
        v->1
        c->-4
        e->2
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
        String str = sc.nextLine();

        hackerDili(str);

        System.out.println("hackerDili1 = " + hackerDili1(str));


    }//main sonu

    public static void hackerDili(String str) {

        String hackerD = str.replace("a", "7")
                .replace("v", "1")
                .replace("c", "-4")
                .replace("e", "2");

        System.out.println("hacker Dili = " + hackerD);

    }

    public static String hackerDili1(String str) {

        return str.replace("a", "7")
                .replace("v", "1")
                .replace("c", "-4")
                .replace("e", "2");



    }//main sonu



}//Class sonu
