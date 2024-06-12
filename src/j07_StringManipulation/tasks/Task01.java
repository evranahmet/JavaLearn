package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task01 {

    //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String ad=scan.nextLine().toUpperCase();
        System.out.println("Lütfen soyadınızı giriniz");
        String soyad=scan.nextLine().toUpperCase();
        System.out.println("ad+soyad = " + ad +" "+ soyad);


    }

}
