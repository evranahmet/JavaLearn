package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*   Bir String oluşturun.
          Konsol'a sevdiğiniz bir meyveyi yazın.
          O meyveyi yazdırınız.   */

        //Kodu aşağıya  yazınız.
        Scanner input = new Scanner(System.in);
        System.out.print("Sevdiğiniz meyveyi giriniz :");
        String meyve=input.next();
        System.out.println("Sevdiginiz meyve = " + meyve);


    }
}
