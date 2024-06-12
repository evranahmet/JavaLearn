package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

    //task-> girilen sayını faktoriyelini print eden METHOD create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int sayi=input.nextInt();

        faktoriel(sayi); // 5! => 5*4*3*2*1 = 120

    }

    public static void faktoriel(int sayi) {

        int faktoriel = 1;

        for (int i = sayi; i > 0; i--) {

            faktoriel *= i;
        }
        System.out.println("faktoriel = " + faktoriel);
    }

}
