package j20_StaticKeyword;

public class  C01_OgretmenRunner {
    public static void main(String[] args) {
        C01_Ogretmen t1=new C01_Ogretmen("Sema",11);
        System.out.println("t1.isim = " + t1.isim);//obj ile Instance variable call edildi-->Sema
        System.out.println("t1.tecrube = " + t1.tecrube);//obj ile Instance variable call edildi-->11
        t1.evlilikTebrikEt();//obj ile non static meth call edildi
        t1.maasHesapla();//obj ile static meth call edildi-->BAD PRACTİCE-->tavsiye edilmez
        C01_Ogretmen.maasHesapla();//ClassName ile static meth call edildi-->Maasin hayirli olsun ilk maasin ile ne ismarliyorsun
        System.out.println("C01_Ogretmen.okulIsmi = " + C01_Ogretmen.okulIsmi);//ClasName ile static variable call edildi-->Sivas Lisesi
        C01_Ogretmen.okulIsmi="Sivas Anadolu Lİsesi";//ClassName ile static variable update edildi
        System.out.println("t1.okulIsmi = " + t1.okulIsmi);//obj ile static variable call edildi-->Sivas Anadolu Lİsesi
        System.out.println("C01_Ogretmen.okulIsmi = " + C01_Ogretmen.okulIsmi);//Sivas Anadolu Lİsesi
        C01_Ogretmen t2=new C01_Ogretmen("merve",13);
        System.out.println("t2.tecrube = " + t2.tecrube);//13
        System.out.println("t2.isim = " + t2.isim);//Merve
        System.out.println("t2.okulIsmi = " + t2.okulIsmi);//Sivas Anadolu Lİsesi


    }
}
