package j09_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {

        /*
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop'un bir sonraki değerinden devam eder.
    */

        // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Emailinizi giriniz");
        String email= scan.nextLine();
        String yeniMail="";
        for (int i = 0; i <=email.length()-1; i++) {//mailin indexi kadar calisacak
            if (email.charAt(i)==' '){//tekrardan gelen her karakterin ' ' esit olma durumu kontrol edildi
                continue;//if true oldugu zaman dongu bir sonraki indexe atlayip devam edecek
            }
            yeniMail+=email.charAt(i);
        }
        System.out.println("yeniMail = " + yeniMail);

    }
}
