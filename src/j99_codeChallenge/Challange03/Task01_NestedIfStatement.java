package j99_codeChallenge.Challange03;

import java.util.Scanner;

public class Task01_NestedIfStatement {
    /* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam hele yasini giresen : ");
        int yas = input.nextInt();
        if (yas >= 18) {//genel sart->yasın 18 den buyuk ve esit olması

            if (yas < 50 && yas >= 18) {//özel sart
                System.out.println("agam tek oy kullanma hakkın var");

            } else if (yas < 70 && yas >= 50) {//özel sart
                System.out.println("agam iki oy kullanma hakkın var");

            } else System.out.println("Agam uc oy kullanma hakkın var");

        } else System.out.println("Agam hele buyude gel oy için reşit değilsin");

        System.out.println("Agam bu satır print edildiyse code cincix dewamke :)");
    }// main sonu

}