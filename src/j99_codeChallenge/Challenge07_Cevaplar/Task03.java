package j99_codeChallenge.Challenge07_Cevaplar;

import java.util.Scanner;

public class Task03 {
    /* task->
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method create ediniz.
      */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam cm giresen : ");
        double cm = input.nextDouble();
        System.out.println("Girilen "+cm+" cm  değeri "+kmConvert(cm)+" km dir ");
        System.out.println("Girilen "+cm+" cm  değeri "+mConvert(cm)+" m dir ");

    }//main sonu

    private static double mConvert(double cm) {

       return  cm/100;
    }

    private static double kmConvert(double cm) {
        return cm/10000;

    }
}//class sonu