package j07_StringManipulation;

import com.sun.tools.javac.Main;

public class C01_Concatenation {//class level
    public static void main(String[] args) {//main menü

        /*
concat() -> methodu içinde parametre aldığı String variable'ı çaloştığı string sonuna ekler(birleştirir)
Java '+' işleminde en az bir string ifade varsa artimetik toplama değil birleştirme yapılır.
 */
        String qa="Halit";
        String teamLead="Abdurrahman";
        System.out.println("Concat oncesi qa = "+qa);//Halit
        System.out.println("qa.concat(teamLead) = " + qa.concat(teamLead));//HalitAbdurrahman
        System.out.println("teamLead.concat(qa) = " + teamLead.concat(qa));//AbdurrahmanHalit
        System.out.println("concat sonrası qa = " + qa);//Halit
        qa=teamLead.concat(qa);
        System.out.println("qa = " + qa);//AbdurrahmanHalit
        /*
        Hap bilgi-->String methodu variable'de kalıcı değil geçici değişiklik yapar.
        String'de kalici degisiklik yapabilmek icin atama yapmak gerekir.
        */
        /*
        Hap Bilgi-->concat methodu parametre olarak String harici bir deger alirsa
        o degeri String'e cevirip Concat(birlestirme) yapar.
        concat methotta String type girilirse bu data type ı String'e cevirmek gerekir.
         */
        System.out.println("teamLead.concat(23) = " + teamLead.concat(23+"$"));//Abdurrahman23$
        System.out.println("teamLead.concat(100+\"\") = " + teamLead.concat(100 + ""));//Abdurrahman100

    }//main sonu
}//class sonu
