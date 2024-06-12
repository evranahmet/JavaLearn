package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task13 {
    //Task-> Girilen   4 harfli bir kelimeyi tersten print eden code create ediniz.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime=scan.nextLine();
        if (kelime.length()==4) {
            for (int i = kelime.length() - 1; i >= 0; i--) {
                System.out.print(kelime.charAt(i));
            }
        }else System.out.println("4 harfli bir kelime giriniz");




    }
}

