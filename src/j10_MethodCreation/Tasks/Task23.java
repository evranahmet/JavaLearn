package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        /*
        Task-> vucüt kitleendexini print eden METHOD create ediniz
        vki->kg(mt*mt)
     18,5 kg/m2 ve daha düşük değerler = Zayıf.
     18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
     25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
     30,0 ve üstü =  obezite.

         */

        Scanner input = new Scanner(System.in);
        System.out.print("kilonuzu kg olarak giriniz : ");
        double kilo = input.nextDouble();
        System.out.print("boy uzunluğunuz metre olarak giriniz : ");
        double boy = input.nextDouble();


        vkiHesapla(kilo, boy);

    }//main sonu

    public static void vkiHesapla(double kilo, double boy) {
        // vki->kg/(mt*mt)

        double vki = kilo / (boy * boy);
        System.out.println("vki = " + vki);

        if (vki <= 18.5) {
            System.out.println("Zayif");
        } else if (vki <= 24.9) {
            System.out.println("Normal");
        } else if (vki <= 29.9) {
            System.out.println("Kilolu");
        } else {
            System.out.println("Obez. Zayifla???");
        }


    }


}