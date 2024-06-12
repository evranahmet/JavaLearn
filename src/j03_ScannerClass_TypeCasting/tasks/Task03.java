package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu alıp ayda yilda ve 40 yilda kac gununun uykuda gectigini print eden code create ediniz
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Günde kaç saat uyuduğunuzu giriniz: ");
        double saat = input.nextDouble();

        int ay= (int) (saat*30) / 24;// ayda kac gun
        int yil = ay*12;//yilda kac gun
        int kirkYil = yil*40;//40 yilda kac gun

        System.out.println("Ayda = " + ay + " yilda =" + yil + " 40 yılda =" + kirkYil + " gününüz uykuda geçmiştir");




    }
}
