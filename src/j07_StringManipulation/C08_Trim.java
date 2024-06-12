package j07_StringManipulation;

public class C08_Trim {//class level
    public static void main(String[] args) {//main menü

         /*
trim()-> İstediğimiz String'in başında veya sonunda varolan boşluk (space)'leri temizler.

       */
        String str="     merhaba  hosgeldiniz   ";
        System.out.println("str = " + str);//      merhaba  hosgeldiniz
        System.out.println("str.length() = " + str.length());//28
        System.out.println("str.trim() = " + str.trim());//merhaba  hosgeldiniz
        System.out.println("str.trim().length() = " + str.trim().length());//20
        System.out.println("str = " + str);//atama yapılmadıgı icin degisme olmadı.

    }//main sonu
}//class sonu
