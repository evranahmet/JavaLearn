package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task11 {
    // Task-> Girilen  isim ve soyismini  hangisinin daha uzun oldugunu print eden code create ediniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("İsminizi giriniz: ");
        String isim=scan.nextLine();
        System.out.print("Soy İsminizi giriniz: ");
        String soyIsim=scan.nextLine();
        if (isim.length()>soyIsim.length()){
            System.out.println("isim soyisimden uzundur");
        } else if (isim.length()<soyIsim.length()) {
            System.out.println("soyisim isimden  uzundur");

        }else System.out.println("isim ve soyisim uzunluğu eşittir");

    }

}