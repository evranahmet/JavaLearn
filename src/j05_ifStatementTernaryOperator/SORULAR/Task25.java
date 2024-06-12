package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        /*
        Proje Konusu
Java dili ile kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını print eden code create ediniz.

(Not : KDV tutarını 18% olarak alın)

Örnek Çıktı
Tutar Giriniz : 100
KDV Oranı : %18
KDV Tutarı : 18.00
KDV'li Tutar : 118.0
Bonus Geliştirme
Eğer girilen tutar 0 ve 500TL arasında ise KDV oranı %18 , tutar 500TL'den büyük ise KDV oranını %8 olarak KDV print eden code create eden
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen tutar giriniz");
        double tutar=sc.nextDouble();

        if (tutar>0 && tutar<500){
            double kdvTutarı = (tutar*18)/100;
            double kdvliTutar=tutar+kdvTutarı;
            System.out.println("KDV oranı : %18");
            System.out.println("Kdv Tutarı : "+ kdvTutarı);
            System.out.println("Kdv'li Tutar : "+ kdvliTutar);

        } else if (tutar>500) {
            double kdv2=(tutar*8)/100;
            double kdvliTutar2=tutar+kdv2;
            System.out.println("KDV oranı : %8");
            System.out.println("Kdv tutarı : "+kdv2);
            System.out.println("kdv'li tutar : "+ kdvliTutar2);

        }






       /*

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen pozitif tutar giriniz");
        double tutar= sc.nextDouble();

        if (tutar>0 && tutar<500){
            double kdv= tutar * 0.18;
            System.out.println("Kdav oranı : %18");
            System.out.println("Kdv Tutarı : "+ kdv);
            System.out.println("Kdv'li tutar : "+ (tutar+kdv));
        }else {

            double kdv= tutar * 0.08;
            System.out.println("Kdav oranı : %8");
            System.out.println("Kdv Tutarı : "+ kdv);
            System.out.println("Kdv'li tutar : "+ (tutar+kdv));
            */

        }
    }

