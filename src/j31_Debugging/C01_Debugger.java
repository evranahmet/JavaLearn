package j31_Debugging;

public class C01_Debugger {

    /*
    Debug yapiyorsan, kodu anlamadin demektir.
    Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
    Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
    Debug etmek kodun mental bir modelinin eksikligine isarettir...


    İki durumda debugger gerekli olabilir:
    *  Mevcut kod devralındığında.
    *  Yeni kod yazıldığında.
    her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
    Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
    */

    static int falanFilan=7;//gökteki güneş her method erişebilir
    public static void main(String[] args) {

        method01();//ev temizliği
    }

    private static void method01() {
        System.out.println("**** method-01 çalışıyor ****");
        falanFilan++;
        int a=0;//local variable tanımlandı
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
            a+=2*i;
        }
        System.out.println();
        System.out.println("**** method-02 call ediliyor ****");
        method02();//mutfak temizliği
        System.out.println("**** method-03 call ediliyor ****");
        method03();//oturma odası temizliği
        System.out.println("**** method-01 bitti  ****");
    }
    private static void method02() {

        falanFilan+=5;
        for (int x = 0; x <=7 ; x++) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("**** method-02 bitti ****");
    }

    private static void method03() {
        System.out.println("**** method-03 çalışıyor ****");
        falanFilan-=3;
        for (int y = 0; y <= 5; y++) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println("**** method-03 bitti  ****");
    }


}
