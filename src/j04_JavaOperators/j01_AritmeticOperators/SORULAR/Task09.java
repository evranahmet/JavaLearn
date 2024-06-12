package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {


    /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayak sayısını print eden code create ediniz.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("İnek sayısını yazınız");
        int inek = input.nextInt();
        System.out.println("Koyun sayısını yazınız");
        int koyun = input.nextInt();
        System.out.println("Tavuk sayısını yazınız");
        int tavuk = input.nextInt();

        System.out.println(" Toplam ayak sayısı :" + ((inek * 4)+ (koyun * 4)+ (tavuk * 2)));








    }

}
