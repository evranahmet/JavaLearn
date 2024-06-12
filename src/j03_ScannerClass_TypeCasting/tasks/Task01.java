package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 74.4"

		 */

        //1. adım Scanner oluştur
        Scanner input = new Scanner(System.in);

        //2. adım vize notunu al
        System.out.print("Vize notunu gir: ");
        int vize = input.nextInt();

        //3. adım final notunu al
        System.out.println("final notunu gir: ");
        int finalNot = input.nextInt();

        //4. adım project notunu al
        System.out.println("Proje notunu gir: ");
        int proje = input.nextInt();

        //5. adım Notu hesapla
        double sonuc = (vize*0.3)+(proje*0.2)+(finalNot*0.5);
        System.out.println("sonuç : " + sonuc);

    }
}
