package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int sayi= scan.nextInt();
        int sayac=0;
        int bolenSayi=1;
        while (bolenSayi<=sayi){
            if (sayi%bolenSayi==0){
                sayac++;
                System.out.print(bolenSayi+" ");
            }
            bolenSayi++;
        }
        System.out.println("girilen sayi = " + sayi+" 'nın "+sayac+ " tane tam böleni var");
    }
}
