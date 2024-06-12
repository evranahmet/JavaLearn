package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class _03_if_statement3 {

    public static void main(String[] args) {

    /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

        Scanner scan = new Scanner(System.in);
        System.out.println("2 tane sayı giriniz");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        //Kodu aşağıya yazınız. BU SATIRDAN ÖNCE YAZILANLARI DEĞİŞTİRMEYİNİZ.


        if (str1==str2){
            System.out.println("String 1 is equal to String 2");
        } else if (str1!=str2) {
            System.out.println("String 1 is NOT equal to String 2");

        }


    }
}
