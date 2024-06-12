package j06_SwitchStatement;

import java.util.Scanner;

public class j05_SwitchCase____ATM {
    public static void main(String[] args) {

        /*
TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
 ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz.
 */
        Scanner scan=new Scanner(System.in);
        int bakiye=1000;
        System.out.println("$$$ Java Bank'a Hoşgeldiniz");
        System.out.println("Yapmak istediğiniz işlemin numarasını giriniz : \n1->Bakiye Sorgulama\n2->Para Çekme\n3->Para Yatırma\n4->Çıkış");
        int secim=scan.nextInt();
        switch (secim){
            case 1:
                System.out.println("hesabında "+ bakiye +"$bakiyen var");
                break;
            case 2:
                System.out.println("Ne kadar para çekmek istiyorsun");
                int cekilenMiktar=scan.nextInt();
                if (cekilenMiktar<= bakiye&&cekilenMiktar>0){
                    bakiye-=cekilenMiktar;
                    System.out.println("Para çekme işlemi başarıyla gerçekleştirildi. Kalan Bakiye = "+bakiye+"$");
                }else {
                    System.out.println("Yetersiz Bakiye");
                }
                break;
            case 3:
                System.out.println("Ne Kadar Para Yatırmak İstiyorsunuz");
                int yatirilanMiktar=scan.nextInt();
                bakiye+=yatirilanMiktar;
                if (yatirilanMiktar>0){
                    bakiye+=yatirilanMiktar;
                    System.out.println("Para yatırma işleni başarıyla gerçekleşti");
                }else {
                    System.out.println("Hatalı Giriş");
                }break;

            case 4:
                System.out.println("Çıkış yapıyorsunuz yine bekleriz");

            default:
                System.out.println("Hatalı Seçim Tekrar Deneyiniz");
        }
    }
}
