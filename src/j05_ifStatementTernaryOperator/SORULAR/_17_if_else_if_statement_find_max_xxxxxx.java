package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max_xxxxxx {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();
        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (i1>i2 && i1>i3){
            System.out.println("i1 en büyük");
        } else if (i2>i1 && i2>i3) {
            System.out.println("i2 en büyüktür");
        } else if (i3>i1 && i3>i2) {
            System.out.println("i3 en büyüktür");

        }else{
            System.out.println("tekrar deneyiniz");
        }


    }
}
