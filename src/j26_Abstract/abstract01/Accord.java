package j26_Abstract.abstract01;

public class Accord extends Honda{
    @Override
    public void motor() {
        System.out.println("2.0 motor çok kaçar");
    }

    @Override
    void koltuk() {
        System.out.println("Deri koltuk pek lü olmuş");
    }

    @Override
    void kapı() {
        System.out.println("4 kapılı arabalar güzel duruyor");
    }

    @Override
    void sunroof() {
        System.out.println("Sigara yakmak için sunroof taktırdın değil mi?");
    }
}
