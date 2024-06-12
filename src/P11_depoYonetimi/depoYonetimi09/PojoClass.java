package P11_depoYonetimi.depoYonetimi09;


public class PojoClass implements DataBase {
    private static int id;
    private String urunIsmi;
    private String ureticiName;
    private int miktar;
    private String birim;
    private int raf;

    public PojoClass(String urunIsmi, String ureticiName, int miktar, String birim, int raf) {
        id++;
        this.urunIsmi = urunIsmi;
        this.ureticiName = ureticiName;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;

    }

    static {
        createProduct();
    }

    public PojoClass() {
    }

    private static void createProduct() {
        PojoClass urun1 = new PojoClass("Vücut Sabunu", "Ahmet", 100, "Karton", 4);
        PojoClass urun2 = new PojoClass("El Sabunu", "Ahmet", 50, "Karton", 3);
        PojoClass urun3 = new PojoClass("Yüz Sabunu", "Ahmet", 200, "Karton", 5);
        PojoClass urun4 = new PojoClass("Sac Icin", "Ahmet", 150, "Karton", 2);
        urun.add(urun1);
        urun.add(urun2);
        urun.add(urun3);
        urun.add(urun4);
    }

    //    public static Urunler getUrun(int urunId){//kullanicinin girdigi id ile kontrol eden method
//        for (Urunler b : urun ) {
//            if (b.getId() == urunId){
//                return b;
//            }
//        }
//        return null;
//    }
    public static void printListe() {
        for (PojoClass e : urun) {
            System.out.println(e);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUreticiName() {
        return ureticiName;
    }

    public void setUreticiName(String ureticiName) {
        this.ureticiName = ureticiName;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "PojoClass{" +
                "id=" + id +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", ureticiName='" + ureticiName + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}
