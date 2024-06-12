package P11_depoYonetimi.DENEME;

import java.util.Map;

import static P11_depoYonetimi.DENEME.Renklendirme.*;
import static P11_depoYonetimi.DENEME.TryCatch.intGirisi;
import static P11_depoYonetimi.DENEME.TryCatch.stringGirisi;
import static P11_depoYonetimi.DENEME.UrunBilgisi.urunBilgisiMap;

public class Islemler implements IslemlerInterface {

   // static Scanner scan = new Scanner(System.in);

    @Override
    public void giris() {
        System.out.println(R+"******İŞLEMLER******\n" +
                "1-ÜRÜN TANIMLAMA\n2-ÜRÜN GİRİŞİ\n3-RAF GÜNCELLEME\n4-ÜRÜN ÇIKIŞI\n5-ÜRÜN LİSTELE\n6-ÇIKIŞ\n");
        System.out.print(W+"İŞLEM SEÇİNİZ : ");
        int secim =intGirisi();
       // scan.nextLine(); // Hata olmaması için
        switch (secim) {
            case 1:
                urunTanimlama();
                giris();
                break;
            case 2:
                urunGirisi();
                giris();
                break;
            case 3:
                urunuRafaKoy();
                giris();
                break;
            case 4:
                urunCikisi();
                giris();
                break;
            case 5:
                urunListele();
                giris();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer giriniz.");
                break;
        }

    }

    @Override
    public void urunTanimlama() {
        UrunBilgisi obj = new UrunBilgisi();
        System.out.println("Ürün İsmi: ");
        obj.setUrunIsmi(stringGirisi());
        System.out.println("Üretici: ");
        obj.setUretici(stringGirisi());
        System.out.println("Birim: ");
        obj.setBirim(stringGirisi());
        int id = UrunBilgisi.getId();
        urunBilgisiMap.put(id,obj);
        UrunBilgisi.setId(id+1);

        System.out.println("Urun basariyla tanimlandi");
        System.out.println("Tanımladığınız ürün asagıda gösterildigi gibi başariyla tanimlanmıstir.");
        System.out.printf(B+BOLD+"%-5s%-15s%-15s%-15s%n",
                "ID", "Ürün İsmi", "Üretici", "Birim\n_________________________________________________");
        System.out.printf("%-5d%-15s%-15s%-15s%n",
                id, obj.getUrunIsmi(), obj.getUretici(), obj.getBirim());

    }

    @Override
    public void urunListele() {
        /*
         System.out.println("id       ismi         ureticisi       miktari       birimi         raf" +
                "\n----------------------------------------------------------------------");
        System.out.println(urunBilgisiMap);
         */
        System.out.println(B+"-----------------------------------------------------------------------");
        System.out.printf(B+"%-5s%-15s%-15s%-8s%-8s%-8s%n", "ID", "İsim", "Üretici", "Miktar", "Birim", "Raf");
        System.out.println(B+"-----------------------------------------------------------------------");
        // System.out.println(UrunBilgisi.urunBilgisiMap);
        for (Map.Entry<Integer, UrunBilgisi> entry : urunBilgisiMap.entrySet()) {
            UrunBilgisi obj  = entry.getValue();
            System.out.printf(B+"%-5d%-15s%-15s%-8d%-8s%-8s%n",
                    entry.getKey(), obj.getUrunIsmi(), obj.getUretici(), obj.getMiktar(), obj.getBirim(), obj.getRaf());
        }
        System.out.println(B+"-----------------------------------------------------------------------");



    }

    @Override
    public void urunGirisi() {
        System.out.println();
        urunListele();
        System.out.println("Giriş yapmak istediğiniz ürün Id'sini girin: ");
        int id =intGirisi();
        if (urunBilgisiMap.containsKey(id)) {
            System.out.println("Ürün miktarını giriniz: ");
            int miktar = intGirisi();
            int oldMiktar = urunBilgisiMap.get(id).getMiktar();
            urunBilgisiMap.get(id).setMiktar(oldMiktar + miktar);
            System.out.println(Y+"Id : " + id + " ürün girişi : " + miktar + " toplam miktar: " + (oldMiktar + miktar));
        } else {
            System.out.println(Y+id + " id'ye sahip ürün bulunamadı! işlemler menuye tekrar yonlendiriliyorsunuz ");
        }
    }

    @Override
    public void urunuRafaKoy() {
        urunListele();
        System.out.println("Rafa koymak istediğiniz ürün Id'sini girin: ");
        int id = intGirisi();
        if (urunBilgisiMap.containsKey(id)) {
            System.out.println("Raf bilgisini giriniz: ");
            urunBilgisiMap.get(id).setRaf(stringGirisi());
            System.out.println(Y+"id: " + id + " ürünü, " + urunBilgisiMap.get(id).getRaf() + " rafına eklediniz.");
        } else {
            System.out.println(Y+id + " id'ye sahip ürün bulunamadı!");

        }
    }

    @Override
    public void urunCikisi() {
        urunListele();
        System.out.println("Ürün ID'sini girin: ");
        int id = intGirisi();
        if (urunBilgisiMap.containsKey(id)) {
            System.out.println("Çıkış miktarını girin: ");
            int cikisMiktari =intGirisi();
            if (urunBilgisiMap.get(id).getMiktar() >= cikisMiktari) {
                int yeniMiktar = urunBilgisiMap.get(id).getMiktar() - cikisMiktari;
                urunBilgisiMap.get(id).setMiktar(yeniMiktar);
                System.out.println(Y+"Ürün çıkışı başarıyla yapıldı.\nKalan miktar: "+yeniMiktar);
            } else {
                System.out.println(Y+"Girilen miktarda ürün bulunmamaktadır.");
            }
        } else {
            System.out.println(Y+"Belirtilen ID'ye sahip bir ürün bulunamadı.");
        }
    }

    @Override
    public void cikis() {
        System.out.println("Programdan çıkılıyor... İyi günler.");
    }
}