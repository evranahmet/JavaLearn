package j23_Encapsulation.encapsulation1;

public class C02_Encapsulation {
    /*
    Java'da POJO, "Plain Old Java Object" kısaltmasıyla bilinen, temel bir Java sınıfıdır.
    Bu sınıflar, verileri ve onların işlemlerini tutmak için kullanılır ve genellikle bir
    veritabanı veya bir dosya gibi dış kaynaklardan veri almak veya onlara veri yazmak için
    kullanılır. POJO'lar, sadece getter ve setter metodları ile erişilen özelliklere sahip
    basit bir data objesi olabilirler. POJO'lar, genellikle diğer objeler veya bileşenlerle
    işbirliği yapmak için kullanılırlar ve bu nedenle data aktarım objeleri (DTO) olarak da adlandırılabilirler.
    */

    //1. Step
    //field-->obj variable-->instance-->private

    String ad="Sema hanim;";
    private  int id=1001;
    private  String email="ebikGabik@gmail.com";
    String soyad="JavaNur";

    //2. Step
    public C02_Encapsulation(String ad, int id, String email, String soyad) {//full p'li const
        this.ad = ad;
        this.id = id;
        this.email = email;
        this.soyad = soyad;
    }

    public C02_Encapsulation() {//p'siz const
    }

    //3. Step

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


//    public  int idVer(){
//        return  id;
//    }
//
//    public  String mailVer(){
//        return  email;
//    }

    //4. Step--> toString


    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", soyad='" + soyad ;
    }
}
