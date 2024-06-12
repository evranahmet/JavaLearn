package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
hipotenus=birinciKenar*birinciKenar+ikinciKenar*ikincikenar karekoku
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz");
        int birinciKenar=scan.nextInt();
        System.out.println("Ikinci kenarı giriniz");
        int ikinciKenar=scan.nextInt();
        double hipotenüs= Math.sqrt((birinciKenar*birinciKenar)+(ikinciKenar*ikinciKenar));
        System.out.println("hipotenüs = " + hipotenüs);


    }
}
