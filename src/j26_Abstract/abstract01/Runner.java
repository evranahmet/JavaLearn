package j26_Abstract.abstract01;

public class Runner {
    public static void main(String[] args) {

        Civic c1=new Civic();
        c1.motor();//1.6 motor neyine yetmiyor
        c1.kapı();//Yavaş kapat elinde kalmasın
        c1.koltuk();//Biraz ucuza kaçıp kumaş koltuk mu yaptırdın
        c1.sunroof();//Honda concrete meth call edildi
        c1.lastikEbat();//18'' lastik kafi
        c1.name="Enes Bey";
        System.out.println("c1.name = " + c1.name);//Enes Bey

        Accord c2=new Accord();
        c2.motor();//2.0 motor çok kaçar
        System.out.println("c2.name = " + c2.name);//Ahmet Bey
        c2.koltuk();//Deri koltuk pek lü olmuş
        c2.kapı();//4 kapılı arabalar güzel duruyor
        c2.sunroof();//Sigara yakmak için sunroof taktırdın değil mi?

        Crv c3=new Crv();
        c3.name="Seher Hanım";
        System.out.println("c3.name = " + c3.name);//Seher Hanım
        c3.motor();//2.4 motor çok yakmaz mı
        c3.kapı();//Himmet abi bana 3 kapılı araba alacan mı?
        c3.koltuk();//Deri koltuk yaz aylarında terletir
        c3.sunroof();//Sunroof olmadan lux olmaz

    }
}
