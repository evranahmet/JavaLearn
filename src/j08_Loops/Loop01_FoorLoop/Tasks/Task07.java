package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir boyut giriniz");
        int boyut= scan.nextInt();
        for (int kat = 1; kat <=boyut ; kat++) {
            for (int daire = 1; daire <=boyut ; daire++) {
//                if (kat==daire){
//                    System.out.print("1 ");
//                }else System.out.print("0 ");
                System.out.print(kat==daire?"1 ":"0 ");
            }
            System.out.println();
        }




    }
}
