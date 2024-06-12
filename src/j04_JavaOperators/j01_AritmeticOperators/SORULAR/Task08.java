package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*Task->
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saniye giriniz : ");
        int saniye = scanner.nextInt();

        int sonuc = saniye/3600;
        int kalanSaniye= saniye % 3600;
        int dk = kalanSaniye / 60;
        int sonSaniye = kalanSaniye & 60;

        System.out.println(saniye + "->" + sonuc + " saat " + dk + " dakika " + sonSaniye + " saniye");






    }
}
