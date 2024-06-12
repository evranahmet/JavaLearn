package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class _18_if_else_statement_find_minxxxxxxxx {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (i1 < i2 && i1 < i3) {
            System.out.println("i1 en küçüktür");
        } else if (i2 < i1 && i2 < i3) {
            System.out.println("i2 en küçüktür");
        } else if (i3 < i1 && i3 < i2) {
            System.out.println("i3 en küçüktür");

        } else {
            System.out.println("tekrar deneyiniz");


        }
    }
}