package j16_PassByValue;

public class C04_PassByValue {
    static double etiketFiyati;//gokteki gunes variable->Class level her meth erisimi olan int type variable tanimlandi
    static double indirimOrani;//gokteki gunes variable->Class level her meth erisimi olan int type variable tanimlandi
    public static void main(String[] args) {
        /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
        1.değişklik  yapılan variable'lar static (gökteki güneş) olarak tanımlanır.
         */
        etiketFiyati=100;
        indirimOrani =0.1;
        System.out.println("Indirim oncesi etiket fiyati : "+etiketFiyati);
        indirim();
        System.out.println("Indirim sonrasi etiket fiyati : "+etiketFiyati);
    }

    private static void indirim() {
        etiketFiyati*=(1-indirimOrani);//gnes variable 0.9 ile carpildi:kalici makyaj yapildi
        System.out.println("Indirilmis etiket fiyati : "+etiketFiyati);
    }
}


