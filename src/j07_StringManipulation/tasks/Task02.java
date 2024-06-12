package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task02 {
    //Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);;
        System.out.println("Lutfen bir kelime giriniz");
        String kelime1=scan.next();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime2=scan.next();
        System.out.println(kelime1.concat(kelime2));
        System.out.println((kelime1.substring(0,1))+(kelime2.substring(0,1)));


    }

}
