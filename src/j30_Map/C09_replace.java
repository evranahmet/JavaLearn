package j30_Map;

import java.util.HashMap;

public class C09_replace {
    public static void main(String[] args) {

        //map.replace();-> girilen  value değeri ilgili Key'de update edilip oldValue(update öncesi eski value) return edilir.

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");

        hm.put("Media Markt", "444 Euro");

        System.out.println("hm replace() öncesi = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.replace(\"Amazon\", \"0.99 Euro\") = " + hm.replace("Amazon", "0.99 Euro"));//296 Euro
        System.out.println("hm replace() sonrası = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=0.99 Euro, Vatan=111 Euro}

        System.out.println("hm.replace(\"Tirit\",\"bedava mı sandın\") = " + hm.replace("Tirit", "bedava mı sandın"));//null
        //map'de olmayan bir key replace edilirse null return eder.
        System.out.println("hm = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=0.99 Euro, Vatan=111 Euro}


    }
}
