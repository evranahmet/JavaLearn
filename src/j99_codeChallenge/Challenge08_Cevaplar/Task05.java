package j99_codeChallenge.Challenge08_Cevaplar;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        // task-> Girilen 8 tamsayının kaçının 3 e tam boludugunu print eden  code create ediniz.
        Scanner input = new Scanner(System.in);
        int arr[] = new int[8]; // 8 yumurta için boş koli tanımlandı
        int count = 0;
        for (int i = 0; i < 8; i++) {// boş koliye yumurta koyan lopp tanımlandı
            System.out.print(i + ".  index elemanı giriniz ");
            arr[i] = input.nextInt();// kulanıcıdan input ilen gelen sayı arr içine atıldı-> yumurta koliye koyuldu
            if (arr[i] % 3 == 0) {
                count++;
            }

        }
        System.out.println("girilen 8 sayıdan 3 e tam bolune eleman sayısı : " + count);//

    }// main sonu


}// Class sonu