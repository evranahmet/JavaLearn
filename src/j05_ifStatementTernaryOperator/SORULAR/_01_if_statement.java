package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class _01_if_statement {

    public static void main(String[] args) {

    /*  İki tane int oluşturun. Birinci (1.) int 35. İkinci (2.) int 23.
        Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
        Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın.  */

        //Kodu aşağıya yazınız.
        Scanner sc=new Scanner (System.in);
        int sayı1=35;
        int sayı2=23;
        if (sayı1>sayı2) {
            System.out.println("int 1 is greater than 2");
        }else if (sayı1<sayı2){
            System.out.println("int 1 is smaller than 2");

        }


    }
}
