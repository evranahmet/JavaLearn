package j06_SwitchStatement.SORULAR;

import java.util.Locale;
import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Köln veya Frankfurta gidebilirsiniz");
        System.out.println("Frankfurt : 60 KM   ---   Köln : 80 KM");
        System.out.println("Bilet fiyatı hesabı = Her 20 Km başına 5 euro");
        System.out.println("Nereye yolculuk etmek istiyorsunuz");
        String  yolculuk= scan.next().toUpperCase();
        int FrankfurtKm=60;
        int kölnKm=80;
        double toplamTutar1=(FrankfurtKm/20)*5;
        double toplamTutar2=(kölnKm/20)*5;
        switch (yolculuk){
            case "FRANKFURT":
                System.out.println("Rota = Frankfurt");
                System.out.println("Frankfurt" +toplamTutar1+" Euro");
                break;
            case "KÖLN":
                System.out.println("Rota = Köln");
                System.out.println(toplamTutar2+" Euro");
                break;
            default:
                System.out.println("Hatalı Giriş");
                break;

        }
        System.out.println("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   ");
        int bilet=scan.nextInt();
        switch (bilet){
            case 1:
                System.out.println("1 kişilik ");
                break;
            case 2:
                System.out.println("2 kişilik  ");


        }







    }
}
