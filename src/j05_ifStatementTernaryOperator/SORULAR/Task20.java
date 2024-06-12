package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task20 {
    /*
    etkinlik öneren program
    Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz");
        int sayi = scan.nextInt();
        if (sayi<5){
            System.out.println("kayak yapabilir");
        } else if (sayi>=5 && sayi<15) {
            System.out.println("sinemaya gidebilir");
        } else if (sayi>=15 && sayi<25) {
            System.out.println("Pikniğe gidebilir");
        } else if (sayi>=25) {
            System.out.println("yüzmeye gidebilir");
        }

    }
}
