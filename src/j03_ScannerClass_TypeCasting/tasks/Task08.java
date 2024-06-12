package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("1. vize notunu giriniz");
        int vize1=scan.nextInt();
        System.out.println("2. vize notunu giriniz");
        int vize2=scan.nextInt();
        System.out.println("final notunu giriniz");
        int finalNot=scan.nextInt();

        double gecmeNotu=(vize1+vize2)*0.3+(finalNot*0.7);
        System.out.println("Geçme Notu = " + gecmeNotu);


    }
}
