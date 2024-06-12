package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task04AtmMethod {//amele köyü
    static int bakiye=1000;//Herkesler ulasabilsin diye gokteki gunes gibi tepeye asildi
    static Scanner scan = new Scanner(System.in);
    public static void anaMenu() {
        System.out.println("Lutfen Isleminizi Seciniz : ");
        int islem = scan.nextInt();
        switch (islem) {
            case 1:
                bakiyeSorgu();
                girisEkrani();
                break;
            case 2:
                paraCekme();
                break;
            case 3:
                paraYatirma();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("Hatali giris. Tekrar deneyniz");


        }
    }

    private static void paraYatirma() {
        System.out.println("Ne kadar para yatiracaksin : ");
        int miktar= scan.nextInt();
        bakiye+=miktar;
        System.out.println("Para yatirma islemi basariyla gerceklesti.\nAnaMenuye yonlendiriliyorsunuz");
        girisEkrani();
    }

    private static void paraCekme() {
        System.out.println("Ne kadar para cekeceksin : ");
        int miktar=scan.nextInt();
        if (miktar>bakiye){
            System.out.println("Yetersiz Bakiye");
            bakiyeSorgu();
            paraCekme();
        }else {
            System.out.println("Para cekme isleminiz basariyla gerceklestirildi.\nAnaMenuye yonlendiriliyorsunuz");
        bakiye-=miktar;
        }
        girisEkrani();
    }

    private static void bakiyeSorgu() {
        System.out.println("Bakiyeniz = "+bakiye+" $");
        //girisEkrani();
    }

    private static void cikis() {
        System.out.println("ATM'den cikisiniz basari ile yapildi. Yine bekleriz.");
    }

    public static void girisEkrani() {
        System.out.println();
        System.out.println("*** JavaBANK'a HOSGELDINIZ ***\n" +
                "ISLEM MENUSU : \n" +
                "Bakiye Sorgu -> 1\nPara Cekme -> 2\nPara Yatirma -> 3\nCikis ->0");
        anaMenu();
    }

}
