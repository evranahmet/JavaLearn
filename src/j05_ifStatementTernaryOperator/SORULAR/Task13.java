package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */

        Scanner sc=new Scanner(System.in);

        System.out.println("1.sayıyı giriniz");
        double sayi1=sc.nextInt();
        System.out.println("2. sayıyı giriniz");
        double sayi2=sc.nextInt();
        System.out.println("lütfen bir işlem seçiniz(+,-,*,/)");
        char işlem=sc.next().charAt(0);
        double sonuc=0;
        if (işlem=='+'){
            sonuc=sayi1+sayi2;
            System.out.println(sonuc);
        }if (işlem=='-'){
            sonuc=sayi1-sayi2;
            System.out.println(sonuc);
        }if (işlem=='*'){
            sonuc=sayi1*sayi2;
            System.out.println(sonuc);
        }if (işlem=='/'){
            sonuc=sayi1/sayi2;
            System.out.println(sonuc);
        }


    }
}
