package j06_SwitchStatement;

import java.util.Scanner;

public class j03_SwitchCase {
    public static void main(String[] args) {

        // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay numarasi giriniz");
        int ayNo = input.nextInt();
        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girilen ay 31 cekmektedir");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girilen ay 30 cekmektedir");
                break;
            case 2:
                System.out.println("Hangi yil giriniz");
                int yil= input.nextInt();
                if (yil%4==0){
                    if (yil%100!=0||yil%400==0){
                        System.out.println("Girilen ay 29 ceker");
                    }else {
                        System.out.println("Girilen ay 28 ceker");
                    }
                }else {
                    System.out.println("Girilen ay 28 ceker");
                }
                break;
            default:
                System.out.println("Hatalı Giriş");
        }
        System.out.println("Kod çalışıyot");
    }
}










