package j99_codeChallenge.Challenge07_Cevaplar;

import java.util.Scanner;

public class Task04 {


    /* task->
    Girilen bir tamsayı için
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini print eden method'lar create ediniz.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam  sayı giresen : ");
        int sayi = input.nextInt();
        System.out.println(negatifPozitifControl(sayi));
        tekCiftControl(sayi);
        System.out.println(sayi < 100 ?Math.abs( sayi % 10 ): ucBasamakRakamTopla(sayi));
       // System.out.println(ucBasamakRakamTopla(sayi));
    }//main sonu

    private static int ucBasamakRakamTopla(int sayi) {
        int rakamToplam=0;
        while (sayi>0) {
            rakamToplam+=sayi%10;
            sayi=sayi/10;
        }

        return rakamToplam;
    }

    private static void tekCiftControl(int sayi) {
        System.out.println(sayi % 2 == 0 ? "CIFT" : "TEK");
    }

    private static String  negatifPozitifControl(int sayi) {
       return sayi>0&&sayi!=0?"POZITIF":"NEGATIF";
    }


}//Class sonu