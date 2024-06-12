package j30_Map;

import java.util.HashMap;

public class C01_HashMap {
    public static void main(String[] args) {

        /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

    1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
            dublicate kabul etmez.
            Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap  print edildiğinde hem key degerleri hem de value degerleri aralarina = sembolu konularak print eder
            HashMap'ler tanımlanırken rastgele(hurra style) siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */
        //map tanımlama
        HashMap<String,String>hm=new HashMap<>();//boş hashmap(hm) kutu tanımladı
        //hm.put();-->girilen key ve value map'e eleman olarak atanır.
        hm.put("Amazon","296 Euro");
        hm.put(null,"222 Euro");//key null değer alabilir
        hm.put(null,"153 Euro");//key unique olmalı tekrarlı girişte üzerine update eder dublicate yapmaz
        hm.put("Ebay","333 Euro");
        hm.put("Vatan",null);//value null değer alabilir
        hm.put("Apple",null);
        hm.put("Apple","500 Euro");//Apple key value 300 Euro olarak update edildi
        hm.put("Apple","300 Euro");//Apple key value 300 Euro olarak update edildi
        hm.put("Teknosa","123 Euro");
        hm.put("Migros",null);//value unique değer  almak zorunda değil tekrarlı olabilir

        //map print-->sout map
        System.out.println("hm = " + hm);//{null=153 Euro, Apple=300 Euro, Ebay=333 Euro, Teknosa=123 Euro, Migros=null, Amazon=296 Euro, Vatan=null}




    }
}
