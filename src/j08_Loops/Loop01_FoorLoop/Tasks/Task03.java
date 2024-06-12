package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();
        int faktor=1;
        while (sayi>1){
            faktor*=sayi;
            sayi--;
        }
        System.out.println("faktör :"+faktor);

    }
}
