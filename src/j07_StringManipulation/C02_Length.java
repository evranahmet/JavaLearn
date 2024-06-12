package j07_StringManipulation;

public class C02_Length {//class level
    public static void main(String[] args) {//main menü
        /*
length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
butun karakterleri(boşluk vs) sayıp adedini verir.
 */
        String str1="Hayattan bir saat calmak :)";
        System.out.println("str1.length() = " + str1.length());//27
        String srt2=" ";//tek binali arsa
        String str3="";//Bos arsa-->hiçlik
        String str4=null;//dutluk
        System.out.println("srt2.length() = " + srt2.length());//1
        System.out.println("str3.length() = " + str3.length());//0
        //System.out.println("str4.length() = " + str4.length());//RTE-->para var ama ekmek yok
        //CTE-->para yok
        System.out.println("Geldin mi sözüme");//RTE hatasından sonra bu kod calısmaz
        /*
        Hap bilgi-->null atanan String variable herhangi bir metin call etmez.
        null--> case sensitive NULL !=null !=Null------bu üç null birbirinin aynısı degildir.
        null-->dutluk:arsa degeri olmayan arazi sadece hicligi gösteren pointer(isaretci)
         */
        String str5;//tanımlanmıs ama deger atanmamıs bos variable
        //System.out.println("str5 = " + str5);//deger atanmamis variable hic bir aksiyona tabi tutulamaz


    }//main sonu
}//class sonu
