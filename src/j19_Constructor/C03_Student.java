package j19_Constructor;

public class C03_Student {//class level
    String ad;
    String soyad;
    int sinif;
    double ortalama;
    int okulNo;
    boolean takdirBelgesi;

    public C03_Student() {

    }

    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif=" + sinif +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdirBelgesi=" + takdirBelgesi;
    }

    public C03_Student(String ad, String soyad, int sinif, double ortalama, int okulNo, boolean takdirBelgesi) {
        this.ad = ad.toUpperCase();
        this.soyad = soyad.toUpperCase();
        this.sinif = sinif;
        this.ortalama = ortalama;
        this.okulNo = okulNo;
        this.takdirBelgesi = takdirBelgesi;
    }

    public static void main(String[] args) {//main level
        /*
    Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
    mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
     */
        C03_Student s1=new C03_Student();//p'siz cost. ile s1 objesi create edildi
        s1.ad="Bahtiyar".toUpperCase();
        s1.soyad="Aydin".toUpperCase();
        s1.okulNo=1453;
        s1.sinif=12;
        s1.ortalama=85.0;
        s1.takdirBelgesi=true;
        C03_Student s2=new C03_Student("JavaNaz".toUpperCase(),"JavaHan",11,45.0,123,false);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s2.mezuniyet(s2.ortalama) = " + s2.mezuniyet(s2.ortalama));
        System.out.println("s1.mezuniyet(s1.ortalama) = " + s1.mezuniyet(s1.ortalama));
        s1.sosyalFaaliyet();
        s2.sosyalFaaliyet();
    }//main sonu

    private void sosyalFaaliyet() {
        System.out.println("Sen evde oturmayi faaliyet mi sandin");
    }

    public String mezuniyet(double ort){
        return ort>50?"Mezun oldunuz":"Tuh bu da gol degil";
    }
}//class sonu
