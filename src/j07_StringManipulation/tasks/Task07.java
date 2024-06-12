package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task07 {

    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = scan.next();
        if (metin.contains("xyz")) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
        System.out.println(metin.contains("xyz") ? true : false);

    }
}
