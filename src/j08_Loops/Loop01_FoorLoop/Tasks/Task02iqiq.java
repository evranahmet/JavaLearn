package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task02iqiq {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin=scan.nextLine();
        String tersMetin="";//bos bir String tanimlandi
        System.out.println("Girilen metin = " + metin);

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);//metnin i. index elemanini tersMetn'e ekledik
        }

        System.out.println("Girilen metnin tersi = "+tersMetin);

//        if (metin.equalsIgnoreCase(tersMetin)){
//            System.out.println("Girilen metin PALINDROM'dur");
//        }else System.out.println("Girilen metin PALINDROM degildir");

        System.out.println(metin.equalsIgnoreCase(tersMetin)?"Girilen metin PALINDROM'dur":"Girilen metin PALINDROM degildir");
        //En son sartimizi ele aldik

    }
}
