package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

       /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kenar uzunluklarini giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        dikUcgen(a,b,c);

    }

    public static void dikUcgen(int a, int b, int c) {
        // a2+b2=c2

        if ((a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b) || (c*c)+(b*b)==(a*a)){

            System.out.println("Dik Ucgendir");
        }else {
            System.out.println("Dik Ucgen Degildir");
        }

    }

}
