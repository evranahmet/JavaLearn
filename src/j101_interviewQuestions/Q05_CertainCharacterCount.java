package j101_interviewQuestions;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /* Task->
     * Girilen  bir cumle ve bir harf için cumlede harfin kac kere  kullanildigini print eden code create ediniz.
     *  ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin= input.nextLine();
        System.out.println("Hangi harfin kac defa kullanildigini istiyorsun");
        char harf=input.next().charAt(0);
        int count=0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i)==harf){
                count++;
            }
        }
        System.out.println("Girdiginiz cumlede "+harf+" harfi "+count+" kere kullanilmis.");

    }
}
