package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    Bir string oluşturunuz.
          Doğum gününüzü konsola giriniz.
          String'i yazdırınız.  */

        //kodu aşağıya yazınız.
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum gününüzü giriniz :");
        String dogumgun=input.next();
        System.out.println("Doğum gününüz = " + dogumgun);



    }
}
