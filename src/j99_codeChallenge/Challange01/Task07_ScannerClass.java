package j99_codeChallenge.Challange01;

import java.util.Scanner;

public class Task07_ScannerClass {


    public static void main(String[] args) {
          /*
    Task->
   girilen iki tam sayının toplam ve farkını print eden code create ediniz.

   */

        Scanner input = new Scanner(System.in);
        System.out.print("Agam hele 1. sayi giresen : ");
        int sayi1 = input.nextInt();
        System.out.print("Agam hele 2. sayi giresen : ");
        int sayi2 = input.nextInt();

        System.out.println("girilen sayi toplami : "+(sayi1+sayi2)+"\ngirilen sayi farkı : "+(sayi1-sayi2));
    }
}
