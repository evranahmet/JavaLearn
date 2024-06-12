package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C02_If_EiseStatement {


    public static void main(String[] args) {
        // task-> girilen yasın 18 den buyulugunu kontrol eden code create ediniz..
        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas>=18) {
            System.out.println("Yasınız 18 den büyüktür");
        }else System.out.println("Büyü de gel");



    }
}
