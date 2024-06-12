package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kg cinsinden bir ağırlık giriniz :");
        byte kg = input.nextByte();
        System.out.println("Ağırlık = " + kg + " kg");





    }
}
