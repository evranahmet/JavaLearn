package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
/*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir boyut giriniz");
        int boyut= scan.nextInt();

        for (int kat = 1; kat <=boyut ; kat++) {
            for (int daire = 1; daire <=boyut; daire++) {
                System.out.print((kat*daire)+"\t");
            }
            System.out.println();
        }

    }
}
