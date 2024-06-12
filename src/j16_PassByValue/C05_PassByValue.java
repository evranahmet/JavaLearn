package j16_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
       2 .değişklik  yapılan variable'lar atama tanımlanır.
         */
        double etiketFiyati=100;//Primitive main scope initial(ilk deger atam ayapilmis) variable
        double indirimOrani=0.1;//Primitive main scope initial(ilk deger atam ayapilmis) variable
        System.out.println("Indirim oncesi etiket fiyati : "+etiketFiyati);//100.0
        etiketFiyati=indir(etiketFiyati,indirimOrani);//atama yapildi
        System.out.println("Indirim sonrasi etiket fiyati : "+etiketFiyati);//90.0
    }

    private static double indir(double etiketFiyati, double indirimOrani) {
        return etiketFiyati*(1-indirimOrani);
    }
}
