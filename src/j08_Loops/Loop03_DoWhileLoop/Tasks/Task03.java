package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        int karekok=5;
        int count=0;
        do{
            if (karekok*karekok==sayi){
                System.out.println("Girilen sayi bir karekoku vardir");
                count++;
            }
            karekok++;
        }while (karekok*karekok<=sayi);
        if (count==0){
            System.out.println("Girilen sayinin karekoku yoktur");
        }







    }
}
