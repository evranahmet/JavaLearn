package j07_StringManipulation.SORULAR;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz

    Scanner scan=new Scanner(System.in);
    System.out.println("Lütfen bir string giriniz");
    String str=scan.nextLine();
    if (str.contains(" ")){
        System.out.println("Boşluk karakteri var");
    }else{
        System.out.println("Boşluk karakteri yok");
    }
    }
}

