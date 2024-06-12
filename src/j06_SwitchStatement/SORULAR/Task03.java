package j06_SwitchStatement.SORULAR;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir hafta sayısı giriniz");
        int hafta=sc.nextInt();
        System.out.println("Bir gün sayısı giriniz");
        int gün=sc.nextInt();
        int hesap=((hafta*7)+gün)%7;
        switch (hesap){
            case 0:
                System.out.println("Pazartesi");
                break;
            case 1:
                System.out.println("Salı");
                break;
            case 2:
                System.out.println("Çarşamba");
                break;
            case 3:
                System.out.println("Perşembe");
                break;
            case 4:
                System.out.println("Cuma");
                break;
            case 5:
                System.out.println("Cumartesi");
                break;
            case 6:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
        }






    }
}
