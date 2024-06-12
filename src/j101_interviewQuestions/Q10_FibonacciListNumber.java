package j101_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_FibonacciListNumber {

    /* Task-!
     Girilen bir tamsayı kadar FIBONACCI dizisini print eden code create ediniz.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= input.nextInt();
        List<Integer> fibonacciList=new ArrayList<>();
        if (sayi<=0){
            System.out.println("Duzgun bir sayi gir kardesim");
        } else if (sayi==1) {
            fibonacciList.add(1);
            System.out.println(fibonacciList);
        } else if (sayi==2) {
            fibonacciList.add(1);
            fibonacciList.add(1);
            System.out.println(fibonacciList);
        }else {
            int sayi1=1;
            int sayi2=1;
            int sayi3;
            fibonacciList.add(sayi1);
            fibonacciList.add(sayi2);
            for (int i = 3; i <=sayi ; i++) {
                sayi3=sayi1+sayi2;
                fibonacciList.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
            }
            System.out.println(fibonacciList);
        }

    }
}