package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task04 {

    /* Task->
     * Girilen  bir kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana  degil ise girilen kelimeyi print eden code create ediniz.
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime= scan.next();
        if (kelime.length()>=3){
            System.out.println(kelime.substring(kelime.length() - 2) + kelime.substring(kelime.length() - 2) + kelime.substring(kelime.length() - 2));

        } else {
            System.out.println(kelime);

        }


    }
}
