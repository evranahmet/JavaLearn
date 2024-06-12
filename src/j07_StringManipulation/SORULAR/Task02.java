package j07_StringManipulation.SORULAR;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olmalı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Password giriniz: ");
        String password = scanner.nextLine();
        if((password.charAt(0)>='A'&&password.charAt(0)<='Z')&&(password.length()-1>=0)&&(password.length()-1<=9)&&
                (password.length()>=6)){
            System.out.println("Password geçerli");
        }else
            System.out.println("Password geçersiz");
        }


        }


