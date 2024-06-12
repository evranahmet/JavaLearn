package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task02_Ternary {
    /* Task->
     * Girilen fiyat için
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * print eden code create ediniz
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Girilen fiyatı giriniz");
        int fiyat = scanner.nextInt();
        if (fiyat >= 10 && fiyat <= 20) {
            System.out.println("Normal");
        } else if (fiyat<10) {
            System.out.println("ucuz");
        } else if (fiyat>=20) {
            System.out.println("pahali");

        }

    }
}
