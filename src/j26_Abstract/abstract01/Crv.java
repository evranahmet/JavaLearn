package j26_Abstract.abstract01;

public class Crv extends Honda {//concrete child class
    @Override
    public void motor() {
        System.out.println("2.4 motor çok yakmaz mı");
    }

    @Override
    void koltuk() {
        System.out.println("Deri koltuk yaz aylarında terletir");
    }

    @Override
    void kapı() {
        System.out.println("Himmet abi bana 3 kapılı araba alacan mı?");
    }

    @Override
    void sunroof() {
        System.out.println("Sunroof olmadan lux olmaz");
    }
}
