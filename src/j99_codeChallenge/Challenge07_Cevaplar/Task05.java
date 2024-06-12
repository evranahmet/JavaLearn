package j99_codeChallenge.Challenge07_Cevaplar;

import java.util.Scanner;

public class Task05 {
    static Scanner sc = new Scanner(System.in);
    // task-> Girilen 2, 3 veya 4 sayı için toplmanı, 4 ten fazla girilen sayı için "Agam toplamyacagım kadar çok sayı girdin",
    // 2 den az girilen sayı için "Agam en az iki sayı giresen" print eden method create ediniz.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam kaç sayı gireceksen : ");
        int sayiAdedi = input.nextInt();
        if (sayiAdedi < 2) {
            System.out.println("Agam en az iki sayı giresen");

        } else if (sayiAdedi == 3) {
            System.out.println("Agam sayi1 giresen ");
            int sayi1 = input.nextInt();
            System.out.println("Agam sayi2 giresen ");
            int sayi2 = input.nextInt();
            System.out.println("Agam sayi3 giresen ");
            int sayi3 = input.nextInt();
            System.out.println(ucSayiTopla(sayi1, sayi2, sayi3));//
        } else if (sayiAdedi == 2) {
            System.out.println("Agam sayi1 giresen ");
            int sayi1 = input.nextInt();
            System.out.println("Agam sayi2 giresen ");
            int sayi2 = input.nextInt();

            System.out.println(ikiSayiTopla(sayi1, sayi2));//
        } else if (sayiAdedi == 4) {
            System.out.println("Agam sayi1 giresen ");
            int sayi1 = input.nextInt();
            System.out.println("Agam sayi2 giresen ");
            int sayi2 = input.nextInt();
            System.out.println("Agam sayi3 giresen ");
            int sayi3 = input.nextInt();
            System.out.println("Agam sayi4 giresen ");
            int sayi4 = input.nextInt();
            System.out.println(dortSayiTopla(sayi1, sayi2, sayi3, sayi4));//
        }else System.out.println("Agam toplamyacagım kadar çok sayı girdin");

    }// main sonu

    public static int ucSayiTopla(int sayi1, int sayi2, int sayi3) {
        return (sayi1 + sayi2 + sayi3);
    }

    public static int ikiSayiTopla(int sayi1, int sayi2) {
        return (sayi1 + sayi2);
    }

    public static int dortSayiTopla(int sayi1, int sayi2, int sayi3, int sayi4) {
        return (sayi1 + sayi2 + sayi3 + sayi4
        );
    }
}// Class sonu
