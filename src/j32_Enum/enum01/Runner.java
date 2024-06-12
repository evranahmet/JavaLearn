package j32_Enum.enum01;

public class Runner {
    public static void main(String[] args) {

        //Task-> verilen yılın ayını numarasına göre kaç gun çektğini print eden code create ediniz.

        Aylar ay=Aylar.MART;//Aylar enum data type da ay variable tanımlanıp değer atamsı yapıldı
        System.out.println("ay = " + ay);//MART
        System.out.println("ay.name() = " + ay.name());//MART
        System.out.println("ay.ordinal() = " + ay.ordinal());//2-->index olarak

        switch (ay){
            case OCAK:
                System.out.println("Ocak 31 gündür");
                break;
            case SUBAT:
                System.out.println("şubat 28 gündür");
                break;
            case MART:
                System.out.println("mart 31 gündür");
                break;
            case NISAN:
                System.out.println("nisan 30 gündür");
                break;
            case MAYIS:
                System.out.println("mayıs 31 gündür");
                break;
            case HAZIRAN:
                System.out.println("haziran 30 gündür");
                break;
            case TEMMUZ:
                System.out.println("temmuz 31 gündür");
                break;
            case AGUSTOS:
                System.out.println("ağustos 31 gündür");
                break;
            case EYLUL:
                System.out.println("eylül 30 gündür");
                break;
            case EKIM:
                System.out.println("ekim 31 gündür");
                break;
            case KASIM:
                System.out.println("kasım 30 gündür");
                break;
            case ARALIK:
                System.out.println("aralık 31 gündür");
                break;
        }
        System.out.println("Bu mesaj geldiyse kod sorunsuz çalışıyordur");
    }
}
