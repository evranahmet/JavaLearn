package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {

        // Task -> Girilen String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        String pin="JavaNur";
        int grsHakki=3;
        while (true){
            System.out.println("Pin kodunu giriniz");
            String kulpin=scan.next();
            if (kulpin.equals(pin)){
                System.out.println("Giriş başarılı");
                break;
            }else
                System.out.println("hatalı pin girdiniz tekrar deneyin");
                grsHakki--;
                System.out.println(grsHakki+" tane deneme hakkın kaldı");
                if (grsHakki==0){
                    System.out.println("hakkın kalmadı telefoncuya git");
                    break;
                }

        }


    }
}
