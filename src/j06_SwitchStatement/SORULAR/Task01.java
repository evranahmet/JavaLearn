package j06_SwitchStatement.SORULAR;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=sc.nextInt();
        int onlarBas=(sayi/10)%10;
        if (sayi>=10){
            switch (onlarBas){
                case 0:
                    System.out.println("0");
                    break;
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                case 9:
                    System.out.println("9");
                    break;
        }
            System.out.println("onlarBas = " + onlarBas);


        }else {
            System.out.println("hatalı giriş yaptınız");
        }








    }
}
