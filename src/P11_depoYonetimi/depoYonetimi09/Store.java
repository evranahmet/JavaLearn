package P11_depoYonetimi.depoYonetimi09;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

      run();

    }

    public static void run() {
        Scanner input=new Scanner(System.in);
        System.out.println("ZW Management e hosgeldiniz"+"\n"+
                "Musteri Islemleri icin 1"+"\n"+
                "Personel Islemleri icin 2"+"\n"
                +"Cikis icin 3 u tuslayiniz");
        int secim= input.nextInt();

        switch (secim){
            case 1:
                Musteri mst=new Musteri();
                mst.musteri();
                run();
                break;
            case 2:

            case 3:
                Musteri mst1=new Musteri();
                mst1.cikis();
                break;


        }

    }
}
