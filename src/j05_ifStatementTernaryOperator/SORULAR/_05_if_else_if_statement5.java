package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

        Scanner sc=new Scanner (System.in);
        double x=90.25;
        double y=90.25;
        if (x>y){
            System.out.println("Hello World");
        } else if (x<y) {
            System.out.println("Not Hello World");

        }else {
            System.out.println("I love java");
        }


    }
}
