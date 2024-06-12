package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task08 {

    /*  Task->
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik"  print eden code create ediniz
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci kelimeyi giriniz");
        String kelime1=scan.next();
        System.out.println("ikinci kelimeyi giriniz");
        String kelime2=scan.next();
        if (kelime1.length()%2==0){
            System.out.println(kelime1.substring(0, kelime1.length() / 2) + kelime2 + kelime1.substring(kelime1.length() / 2));
        }else System.out.println("kelime2 kelime1'e eklenemez");


    }


}
