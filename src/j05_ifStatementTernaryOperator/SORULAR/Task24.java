package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        /*
        *Java ile gidilen kilometre verisine göre taksimetre tutarını  print eden code create ediniz.
        *Taksimetre kilometre başına 2.20 TL tutmaktadır.
        *Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen kilometre giriniz");
        double kilometre = sc.nextDouble();
        double acılıs = 10;
        double taksimetre = 2.20;
        double ücret = 20;

        if (kilometre<=9){
            System.out.println("Tutar = " + ücret + " TL'dir");
        } else if (kilometre>9) {
            System.out.println("Tutar = " + (acılıs+(kilometre*taksimetre)) + " TL'dir");

        }
    }
}

