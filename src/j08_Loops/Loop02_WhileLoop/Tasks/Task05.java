package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi giriniz");
		String isim = scan.nextLine().replace(" ","");
		char ilkHarf = isim.charAt(0);
		System.out.println("Soyisiminizi giriniz");
		String soyIsim = scan.next();
		char sonHarf = soyIsim.charAt(soyIsim.length() - 1);
		if (ilkHarf <= sonHarf) {
			while (ilkHarf <= sonHarf) {
				System.out.print(ilkHarf + " ");
				ilkHarf++;
			}
		} else {
			while (sonHarf <= ilkHarf) {
				System.out.print(sonHarf + " ");
				sonHarf++;
			}
		}
		System.out.println();

		//diger dusunce
		int i = 0;
		while (i <= isim.length() - 1) {
			System.out.print(isim.charAt(i) + " ");
			i++;
		}
		i=0;
		while (i <= soyIsim.length() - 1) {
			System.out.print(soyIsim.charAt(i) + " ");
			i++;
		}
	}

}




