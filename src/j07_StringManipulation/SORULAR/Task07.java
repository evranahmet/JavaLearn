package j07_StringManipulation.SORULAR;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz");
        String str=scan.next();
        System.out.println("Lütfen bir index giriniz");
        int index=scan.nextInt();
        if (str.length()>index){
            System.out.println(str.charAt(index));
        }else{
            System.out.println("index belirtilen uzunluk dışındadır");
        }




    }
}
