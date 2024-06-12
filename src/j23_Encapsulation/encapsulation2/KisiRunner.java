package j23_Encapsulation.encapsulation2;

public class KisiRunner {
    public static void main(String[] args) {
        Kisi obj1=new Kisi("Aydin","Bahtiyar","123asd",-34);
        System.out.println("obj1 = " + obj1);
        System.out.println("obj1.getAd() = " + obj1.getAd());
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        System.out.println("obj1.getSoyad() = " + obj1.getSoyad());
        System.out.println("obj1.getYas() = " + obj1.getYas());

        obj1.setAd("Sema");
        System.out.println("obj1.getAd() = " + obj1.getAd());



    }
}
