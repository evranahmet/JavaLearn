package j101_interviewQuestions;

import java.util.Scanner;

public class Q12_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
    Create a function that takes an array and the difference between the largest
    and the smallest numbers.
    Ask user to enter array elements.
    Girilen  bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını return eden  method create ediniz.
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= input.nextInt();
        System.out.println("perfectNumber(sayi) = " + perfectNumber(sayi));

    }//main sonu

    private static String perfectNumber(int sayi) {
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                toplam+=i;
            }
        }
        return toplam==sayi?sayi+" sayisi MUKEMMELDIR.":sayi+" sayisi MUKEMMEL degildir.";
    }
}//Class sonu

