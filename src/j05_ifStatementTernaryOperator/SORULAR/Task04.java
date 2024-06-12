package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/


		/*
		 Logical Operator (Mantik Islemleri)
		 1) And Islemi : Sembolu & veya && dir.&& sembolu daha hizli calisir.Bu yuzden genellikle && kullaniriz
		 						true && true = true
		 						true && false = false
		 						false && true = false
		 						false && false = false
		 2)Or Islemi : Sembolu || dir
		 						true || false = true
		 						true || true = true
		 						false || true = true
		 						false || false = false
		 3)Not Islemi : Sembolu !'dir
		 						!true = false
		 						!false = true
		 						
		 						
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen bir character giriniz: ");
		char karakter=sc.next().charAt(0);
		if (karakter>='A' && karakter<='Z') {
			System.out.println("Buyuk Harf");
		} else if (karakter>='a' && karakter<='z') {
			System.out.println("Küçük Harf");
		} else {
			System.out.println("bu karakter harf değildir");

		}

	} 

}
