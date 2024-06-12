package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen isim giriniz");
        String isim = input.next();
        System.out.println("lütfen soyisim giriniz");
        String soyisim = input.next();
        System.out.println("lütfen yaş giriniz");
        int yaş = input.nextInt();
        System.out.println("lütfen kilo giriniz");
        int kilo = input.nextInt();
        System.out.println("lütfen boy giriniz");
        int boy = input.nextInt();
        System.out.println("lütfen salona devam edeceği ay süresini giriniz");
        int ay = input.nextInt();
        double toplam = (20*ay);
        System.out.println("Toplam ücretiniz = " + toplam + " $");

    }
}
