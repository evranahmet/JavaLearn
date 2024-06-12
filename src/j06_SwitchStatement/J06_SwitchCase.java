package j06_SwitchStatement;

import java.util.Scanner;

public class J06_SwitchCase {
    public static void main(String[] args) {
        // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..

        Scanner scan=new Scanner(System.in);
        System.out.println("Haftanın Bir Gününü Giriniz");
        String gun=scan.next().toLowerCase();
        switch (gun){
            case "pazartesi" :
            case "salı" :
            case "çarşamba" :
            case "perşembe" :
            case "cuma" :
                System.out.println("Girilen gün hafta içi");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Girilen gün hafta sonu");
                break;
            default:
                System.out.println("Hatalı Giriş");

        }



    }
}
