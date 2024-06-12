package j19_Constructor;

public class Insan {//class level
    String isim="Ademoglu";
    int yas;
    String babaAdi="Hz Adem";
    char cinsiyet='E';

    //Trick-> Class'da p'li bir const olustugu an javanin olusturdugu default const ezilir
    //istenirse manuel olarak p'siz const create edilir
    public Insan(String isim, int yas) {//2 p'li const
        this.isim = isim;

    }

    public Insan(String isim, String babaAdi) {//2p'li const
        this.isim = isim;
        this.babaAdi = babaAdi;
    }

    public Insan(String name, int age, String babaAdi, char cins) {//full p'li telescopic const
        this.isim = name;
        this.yas = age;
        this.babaAdi = babaAdi;
        this.cinsiyet = cins;
    }

    public Insan() {//psiz const create edildi
    }

    public static void main(String[] args) {//main level
        Insan insan1=new Insan();
        Insan insan2=new Insan("Sema",27);
        Insan insan3=new Insan("Savfet","Muzaffer");
        Insan insan4=new Insan("Dogukan",39,"Mehmet",'E');
        System.out.println(insan4.isim+" "+insan4.babaAdi+" "+insan4.yas+" "+insan4.cinsiyet);//Dogukan Mehmet 39 E
        System.out.println(insan1.isim+" "+insan1.babaAdi+" "+insan1.yas+" "+insan1.cinsiyet);//Ademoglu Hz Adem 0 E
        System.out.println(insan2.isim+" "+insan2.babaAdi+" "+insan2.yas+" "+insan2.cinsiyet);//Sema Hz Adem 0 E
        System.out.println(insan1.isim+" "+insan3.babaAdi+" "+insan2.yas+" "+insan4.cinsiyet);//Ademoglu Muzaffer 0 E
        System.out.println(insan4);//j19_Constructor.Insan@3cbbc1e0


    }//main sonu
}//class sonu
