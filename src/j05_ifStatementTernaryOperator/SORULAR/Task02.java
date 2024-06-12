package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 
		 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen üçgenın 1. kenar uzunluğunu giriniz : ");
        int kenar1= sc.nextInt();
        System.out.println("Lütfen üçgenın 2. kenar uzunluğunu giriniz :");
        int kenar2= sc.nextInt();
        System.out.println("Lütfen üçgenın 3. kenar uzunluğunu giriniz :");
        int kenar3= sc.nextInt();
        if (kenar1==kenar2 && kenar1==kenar3 && kenar2==kenar3) {
            System.out.println("Eşkenar Üçgen");
        } else if (kenar1==kenar2 || kenar1==kenar3||kenar2==kenar3) {
            System.out.println("ikizkenar Üçgen");

        }else {
            System.out.println("Çeşitkenar Üçgen");
        }


    }


}
