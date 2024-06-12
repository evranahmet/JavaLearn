package j20_StaticKeyword;

public class C03_StaticKeyword {

    int ogrId;//inst(obj) variable
    static  int ogrSayisi;//static (class) variable

    public C03_StaticKeyword() {//p'siz const
        ogrSayisi++;//bu const call edildiginde yani obj create edildiginde
        //ogrSayisi static variable kalici(her obj içib aynı deger) olarak arttirilir
        ogrId++;//bu const call edildiginde yani obj create edildiginde
        //ogrId create edilen obj'ye özel deger alir.
    }

    public static void main(String[] args) {
        System.out.println("a obj oncesi ogrenci sayisi :"+ ogrSayisi);//0
        C03_StaticKeyword a=new C03_StaticKeyword();
        System.out.println("a obj sonrasi ogrenci sayisi :"+ ogrSayisi);//1
        C03_StaticKeyword b=new C03_StaticKeyword();
        C03_StaticKeyword c=new C03_StaticKeyword();
        C03_StaticKeyword d=new C03_StaticKeyword();
        System.out.println("a,b,c,d obj'leri sonrasi ogrenciSayisi :" +ogrSayisi);//4

        C03_StaticKeyword e;//obj declaration ama assingment yapilmamis-->const call yok
        System.out.println("e obj sonrasi ogrenci sayisi :"+ ogrSayisi);//4
        System.out.println("a ogrId :"+a.ogrId);//1
        System.out.println("a ogrId :"+b.ogrId);//1
        System.out.println("a ogrId :"+c.ogrId);//1
        System.out.println("a ogrId :"+d.ogrId);//1
        //System.out.println("e.ogrId = " + e.ogrId);


    }
}
