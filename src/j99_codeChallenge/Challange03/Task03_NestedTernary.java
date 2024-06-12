package j99_codeChallenge.Challange03;

import java.util.Scanner;

public class Task03_NestedTernary {

    /*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("final notunuzu A,B,C olarak giriniz");
        String finalNotu=input.next().toUpperCase();
        if(finalNotu.equals("A")){
            System.out.println("gayet basarili");

        } else if (finalNotu.equals("B")) {


        } else if (finalNotu.equals("C")) {

        }else {
            System.out.println("Notunuzu doğru giriniz");
        }


    }

}
