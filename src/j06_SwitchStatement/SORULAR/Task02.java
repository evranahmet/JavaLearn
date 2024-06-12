package j06_SwitchStatement.SORULAR;

import java.util.Locale;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir gün giriniz");
        String gün=sc.next().toLowerCase();
        switch(gün){
            case "pazartesi" :
                System.out.println("çarşamba" );
                break;
            case "salı" :
                System.out.println("perşembe" );
                break;
            case "çarşamba" :
                System.out.println("cuma" );
                break;
            case "perşembe" :
                System.out.println("cumartesi" );
                break;
            case "cuma" :
                System.out.println("pazar" );
                break;
            case "cumartesi" :
                System.out.println("pazartesi" );
                break;
            case "pazar" :
                System.out.println("salı" );
                break;
                default:
                    System.out.println("Hatalı giriş yaptınız");
        }



    }
}

