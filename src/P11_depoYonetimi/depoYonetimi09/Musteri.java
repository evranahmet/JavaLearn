package P11_depoYonetimi.depoYonetimi09;

import java.util.Scanner;

public class Musteri implements DataBase,MusteriIslemleri {
    Scanner input=new Scanner(System.in);
    public void musteri(){
        System.out.println("urun listeleme icin 1"+"\n"+
                "satinalma icin 2"+"\n"+
                "urun arama icin 3"+"\n"+
                "sepet goruntuleme icin 4"+"\n"+
                "cikis icin 5 i tuslayin");
        int secim=input.nextInt();
        switch (secim){
            case 1:
                urunListele();
                musteri();
                break;
            case 2:
                urunSatinAlma();
                musteri();
                break;
            case 3:
                urunArama();
                musteri();
                break;
            case 4:
                sepetGoruntuleme();
                musteri();
                break;
            case 5:
                cikis();
                break;
            default:
                System.out.println("hatali tuslama yaptin tekrar dene");
                musteri();
                break;
        }

    }
    @Override
    public void urunListele() {
        PojoClass.printListe();

    }

    @Override
    public void urunSatinAlma() {
        urunListele();
        System.out.println("hangi urunu almak istiyorsun id sini gir ");
        int secilenUrun= input.nextInt();
        for (PojoClass b:urun) {
            if (b.getId()==secilenUrun){
                System.out.println(b.getId()+" "+b.getUrunIsmi());
                DataBase.sepet.add(b.getId()+" "+b.getUrunIsmi());
                break;
            }
            else System.out.println("istenen urun bulunamadi");
            break;
        }

    }

    @Override
    public void urunArama() {
        urunListele();
        System.out.println("aradigin urunun id sini listeden sec");
        int secim= input.nextInt();
        for (PojoClass e:urun) {
            if (e.getId()==secim){
                System.out.println("aranan urun listede mevcut"+" "+e.getUrunIsmi()+" "+e.getRaf()+" numarali rafta");
                break;
            }else System.out.println("aranan urun listede bulunamadi");
            break;
        }
    }

    @Override
    public void sepetGoruntuleme() {
        System.out.println(DataBase.sepet);
    }

    @Override
    public void cikis() {
        System.out.println("Iyi Gunler Tekrar Bekleriz");
        System.exit(0);

    }

}
