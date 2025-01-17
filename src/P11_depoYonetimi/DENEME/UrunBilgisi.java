package P11_depoYonetimi.DENEME;

import java.util.HashMap;
import java.util.Map;

public class UrunBilgisi {
   static Map<Integer, UrunBilgisi> urunBilgisiMap = new HashMap<>();
    private static int id = 1000;
    private String urunIsmi;

    private String uretici;
    private int miktar;
    private String birim;
    private String raf;

  public UrunBilgisi() {
  }

  public UrunBilgisi(String urunIsmi, String uretici, int miktar, String birim, String raf) {
    this.urunIsmi = urunIsmi;
    this.uretici = uretici;
    this.miktar = miktar;
    this.birim = birim;
    this.raf = raf;
  }



  public static int getId() {
    return id;
  }

  public static void setId(int id) {
    UrunBilgisi.id=id;
  }

  public String getUrunIsmi() {
    return urunIsmi;
  }

  public void setUrunIsmi(String urunIsmi) {
    this.urunIsmi = urunIsmi;
  }

  public String getUretici() {
    return uretici;
  }

  public void setUretici(String uretici) {
    this.uretici = uretici;
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

  public String getRaf() {
    return raf;
  }

  public void setRaf(String raf) {
    this.raf = raf;
  }

  @Override
  public String toString() {
    return
            "urunIsmi='" + urunIsmi + '\'' +
            ", uretici='" + uretici + '\'' +
            ", miktar=" + miktar +
            ", birim='" + birim + '\'' +
            ", raf='" + raf + '\'' +
            '}';
  }
}
