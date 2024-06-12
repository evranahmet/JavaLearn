package j07_StringManipulation.SORULAR;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("3 keimelik bir metin giriniz");
        String metin=scan.nextLine().toUpperCase().trim();
        //1.yontem
        if (metin.indexOf(" ",metin.indexOf(" ")+1)==metin.lastIndexOf(" ")){
            System.out.println(metin.charAt(0)+"."+metin.charAt(metin.indexOf(" ")+1)+"."+metin.charAt(metin.lastIndexOf(" ")+1)+".");
        } else if (metin.indexOf(" ")==metin.lastIndexOf(" ")) {
            System.out.println("2 kelime kabul etmiyorum");
        } else System.out.println("sadece 3 kelime olsun metin");
        //2.yontem
        System.out.println("****2.yontem***");
        int ilkBosluk=metin.indexOf(" ");
        int ikinciBosluk=metin.lastIndexOf(" ");

        char adIlkHarf=metin.charAt(0);
        char ad2IlkHarf=metin.charAt(ilkBosluk+1);
        char soyAdIlkHarf=metin.charAt(ikinciBosluk+1);
        System.out.println(adIlkHarf+"."+ad2IlkHarf+"."+soyAdIlkHarf+".");



    }
}
