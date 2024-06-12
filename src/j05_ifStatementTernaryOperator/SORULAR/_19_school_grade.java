package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Task->
        Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE

        Scanner scan = new Scanner(System.in);
        System.out.println("sınav notunuzu giriniz");
        int sınav= scan.nextInt();
        System.out.println("ara sınav notunuzu giriniz");
        int ara_sınav= scan.nextInt();
        System.out.println("final notunuzu giriniz");
        int final_not= scan.nextInt();
        int ortalama=(sınav+ara_sınav+final_not)/3;
        if (ortalama>=90){
            System.out.println("Notunuz A'dır");
        } else if (ortalama>=70 && ortalama<90) {
            System.out.println("Notunuz B'dir");

        } else if (ortalama>=50 && ortalama<70) {
            System.out.println("Notunuz C'dir");

        } else if (ortalama<50) {
            System.out.println("Notunuz F'dir");

        }


    }
}
