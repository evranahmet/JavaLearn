package j26_Abstract.CEVAPLAR.abstract05;

public class Kedi extends Hayvan {


    @Override
    void yiyecegi() {
        System.out.println("mama veya balık");
    }

    @Override
    void yemekMiktari() {

        System.out.println("100gr");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("10 saat");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }

}