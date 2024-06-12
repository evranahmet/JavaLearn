package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir metin giriniz");
		String str = scan.nextLine();

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				count++;
			}

		}
		if (count > 0) {
			System.out.println(str + " içinde " + count + " adet rakam vardır");
		} else {
			System.out.println(str + " içinde rakam yoktur");
		}
		//2. yol
		System.out.println("\n2. yol");
		int sayac = 0;
		for (int i = 0; i < str.length(); i++) {
			char karakter = str.charAt(i);
			if (Character.isDigit(karakter)) {
				sayac++;
			}

		}
		if (count > 0) {
			System.out.println(str + " içinde " + sayac + " adet rakam vardır");
		} else {
			System.out.println(str + " içinde rakam yoktur");
		}
		//3. yol
		System.out.println("\n3. yol");
		int temp = str.replaceAll("\\D", "").length();
		if (temp > 0) {
			System.out.println(str + " içinde " + temp + " adet rakam vardır");
		} else {
			System.out.println(str + " içinde rakam yoktur");
		}
		//4. yol
		System.out.println("\n4. yol");
		int temp2 = str.replaceAll("[^0-9]", "").length();
		if (temp2 > 0) {
			System.out.println(str + " içinde " + temp2 + " adet rakam vardır");
		} else {
			System.out.println(str + " içinde rakam yoktur");
		}
	}
}
