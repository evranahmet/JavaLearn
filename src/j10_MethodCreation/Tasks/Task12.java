package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("mail giriniz: ");
        String mail = sc.nextLine();

        System.out.println("mail Kontrol = " + mailKontrol(mail));

    }//main sonu

    public static boolean mailKontrol(String mail) {

        boolean dogruMu = false;
/*
        if (mail.contains(".") && mail.contains("@") && !(mail.startsWith("@"))) {
            dogruMu = true;
        }*/

        if (mail.contains(".") && mail.contains("@") && (mail.charAt(0) != '@')) {
            dogruMu = true;
        }

        return dogruMu;

    }//main sonu



}//Class sonu
