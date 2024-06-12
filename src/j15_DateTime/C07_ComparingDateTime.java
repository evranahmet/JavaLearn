package j15_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate tarih1=bugun.plusDays(33);
        LocalDate tarih2=bugun.minusDays(66);
        LocalDate saimDT=LocalDate.of(1975,02,26);
        System.out.println("saimDT = " + saimDT);//1975-02-26
        System.out.println("tarih2 = " + tarih2);//2023-12-22
        System.out.println("tarih1 = " + tarih1);//2024-03-30
        System.out.println("bugun = " + bugun);//2024-02-26

        System.out.println("tarih1.isLeapYear() = " + tarih1.isLeapYear());//true
        System.out.println("tarih1.isAfter(saimDT) = " + tarih1.isAfter(saimDT));//true
        System.out.println("saimDT.isBefore(tarih2) = " + saimDT.isBefore(tarih2));//true

        System.out.println("***");
        System.out.println("bugun.compareTo(saimDT) = " + bugun.compareTo(saimDT));//49->yil
        System.out.println("tarih1.compareTo(tarih2) = " + tarih1.compareTo(tarih2));//1-> yil
        System.out.println("tarih2.compareTo(tarih2) = " + tarih2.compareTo(tarih2));//0

         /*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */

    }
}
