package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class _09_if_else_if_statement_with_logic_operatorsxxxxxxxxx {

    public static void main(String[] args) {

      /* str bir String'dir.
        Eğer String Orange'ye eşit ise ve uzunluğu 6'ya eşit ise "Orange has six letters" yazdırınız.
        Eğer String Apple'ye eşit ise ve uzunluğu 5'ya eşit ise "Apple has five letters" yazdırınız.
        Eğer String Orange'yi kapsıyorsa ve uzunluğu 10'dan fazla ise
        "String contain orange and length is more then 10" yazdırınız.
        Not: Uzunluk derken ingilizcedeki "length" yani karakter sayısından bahsediliyor.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str = scan.nextLine();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (str.equalsIgnoreCase("Orange") && str.length() ==6) {
            System.out.println("Orange has six letters");
        }
        else if (str.equalsIgnoreCase("Apple") && str.length() == 5) {
            System.out.println("Apple has five letters");
        }
        else if (str.contains("Orange") && str.length() > 10) {
            System.out.println("String contain orange and length is more then 10");
        }else System.out.println("lütfen tekrar deneyiniz");

    }
}
