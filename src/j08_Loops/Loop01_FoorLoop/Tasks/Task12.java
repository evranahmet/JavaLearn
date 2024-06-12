package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i <=5; i++) {
            System.out.println(i+". sayiyi giriniz");
            int sayi= scan.nextInt();
//            if (sayi<=10||sayi>=20){
//                toplam+=sayi;
//            }
            toplam+=sayi<=10||sayi>=20?sayi:0;
        }
        System.out.println("toplam = " + toplam);



    }
}
