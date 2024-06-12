package j07_StringManipulation;

import java.util.Scanner;

public class C06_SubString {//class level
    public static void main(String[] args) {//main menü
        /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune  String olarak ulaşılmak istenebilir..
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> exclusive/haric
 */
        String str="madem geldin dünyaya calis Java'ya";
        System.out.println(str.substring(5));//5. index dahil metnin sonuna kadar--> geldin dünyaya calis Java'ya
        System.out.println(str.length());//34

        //str'nin son 10 karakterini print ediniz.
        System.out.println(str.substring(str.length()-10));//is Java'ya

        //str nin ilk 10 karakterini print ediniz
        System.out.println(str.substring(0,10));//madem geld

        //str nin ilk karakterini print ediniz
        System.out.println(str.substring(0,1));//m
        System.out.println(str.charAt(0));//m-->tek karakter icin charAt kullanılır.

        //str nin son karakterini print ediniz
        System.out.println(str.substring(str.length()-1));

        // task-> girilen 4 harfli bir kelimenin tersten print eden code create ediniz. -> kale:elak

        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String str1=scan.next();
        if (str1.length()==4){
            System.out.println(str1.substring(str1.length()-1)+str1.substring(2,3)+
                    str1.substring(1,2)+str1.substring(0,1));
            System.out.println(""+str1.charAt(str1.length()-1)+str1.charAt(2)+str1.charAt(1)+str1.charAt(0));//2.yol
        }else System.out.println("4 harfli olsun dikkat et");









    }//main sonu
}//class sonu
