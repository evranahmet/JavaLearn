package j101_interviewQuestions;

import java.util.Scanner;

public class Q28_OddIndexNumber {
    // Task-> girilen str'deki indexi tek olan karakterleri print eden code create ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String str= input.nextLine();

        for (int i = 1; i < str.length(); i+=2) {
            System.out.print(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (i%2!=0){
                System.out.print(str.charAt(i));
            }
        }

    }
}