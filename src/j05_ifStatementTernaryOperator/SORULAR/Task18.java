package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task18 {
    /* Koç Burcu : 21 Mart - 20 Nisan
       Boğa Burcu : 21 Nisan - 21 Mayıs
       İkizler Burcu : 22 Mayıs - 22 Haziran
       Yengeç Burcu : 23 Haziran - 22 Temmuz
       Aslan Burcu : 23 Temmuz - 22 Ağustos
       Başak Burcu : 23 Ağustos - 22 Eylül
       Terazi Burcu : 23 Eylül - 22 Ekim
       Akrep Burcu : 23 Ekim - 21 Kasım
       Yay Burcu : 22 Kasım - 21 Aralık
       Oğlak Burcu : 22 Aralık - 21 Ocak
       Kova Burcu : 22 Ocak - 19 Şubat
       Balık Burcu : 20 Şubat - 20 Mart

       switch-case kullanmadan yapınız. */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Kacinci ay dogdunuz");
        int ay= scan.nextInt();
        System.out.println("Dogum gununuzu rakam olarak giriniz");
        int gun= scan.nextInt();
        if (gun>=1&&gun<=31){
            if (ay==1){
                if (gun<=21){
                    System.out.println("Oglak burcu");
                }else {
                    System.out.println("Kova burcu");
                }
            }
            if (ay==2){
                if (gun<=19){
                    System.out.println("Kova burcu");
                }else {
                    System.out.println("Balik burcu");
                }
            }
            if (ay==3){
                if (gun<=20){
                    System.out.println("Balik burcu");
                }else {
                    System.out.println("Koc burcu");
                }
            }
            if (ay==4){
                if (gun<=20){
                    System.out.println("Koc burcu");
                }else {
                    System.out.println("Boga burcu");
                }
            }
            if (ay==5){
                if (gun<=21){
                    System.out.println("Boga burcu");
                }else {
                    System.out.println("Ikizler burcu");
                }
            }
            if (ay==6){
                if (gun<=22){
                    System.out.println("Ikizler burcu");
                }else {
                    System.out.println("Yengec burcu");
                }
            }
            if (ay==7){
                if (gun<=22){
                    System.out.println("Yengec burcu");
                }else {
                    System.out.println("Aslan burcu");
                }
            }
            if (ay==8){
                if (gun<=22){
                    System.out.println("Aslan burcu");
                }else {
                    System.out.println("Basak burcu");
                }
            }
            if (ay==9){
                if (gun<=22){
                    System.out.println("Basak burcu");
                }else {
                    System.out.println("Terazi burcu");
                }
            }
            if (ay==10){
                if (gun<=22){
                    System.out.println("Terazi burcu");
                }else {
                    System.out.println("Akrep burcu");
                }
            }
            if (ay==11){
                if (gun<=21){
                    System.out.println("Akrep burcu");
                }else {
                    System.out.println("Yay burcu");
                }
            }
            if (ay==12){
                if (gun<=21){
                    System.out.println("Yay burcu");
                }else {
                    System.out.println("Oglak burcu");
                }
            }
        }else System.out.println("Duzgun bir gun giriniz");
    }
    }
