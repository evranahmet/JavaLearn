package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz : ");
        int yıl=sc.nextInt();
        if (yıl>=1000) {
            System.out.println("Milenyum");
        } else if (yıl>=100 && yıl<1000) {
            System.out.println("yüzyıl");

        } else if (yıl>=10 &&yıl<100) {
            System.out.println("onyıl");

        }


    }
}

	

