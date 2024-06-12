package j07_StringManipulation.SORULAR;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("bir string giriniz: ");
        String text = scan.nextLine();

        String textYeni = text.replace(" ","");
        System.out.println(textYeni.length());
    }
}
