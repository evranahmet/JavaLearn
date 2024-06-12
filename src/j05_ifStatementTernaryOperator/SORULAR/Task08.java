package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("password giriniz");
		int password = sc.nextInt();
		if (password %5==0 && password%10==0 ){
			System.out.println("5’e bölünen çift sayı");
		} else if (password %10!=0 && password%5==0) {
			System.out.println("5’e bölünen tek sayı");

		} else if (password%5!=0) {
			System.out.println("Tekrar deneyin");

		}


	}

}
