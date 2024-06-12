package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int sayı= sc.nextInt();
        if (sayı>=100 && sayı<1000 ) {
            System.out.println("3 basamakli");
        } else if (sayı>=10 && sayı<100) {
            System.out.println("2 basamakli");
        } else{
            System.out.println("ikisi de degil");
        }

    }


    }
