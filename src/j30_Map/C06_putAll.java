package j30_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {

        // map.putAll();-> Girilen map istenen map'e eklenir.

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm putAll() öncesi = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}

        HashMap<String, String> hm1 = new HashMap<>();//bos hm tanımlandı

        hm1.put("javaCAN ", "abdullah");
        hm1.put("javaNAZ", "sebinem");
        hm1.put("javaTAR", "busura");
        hm1.put("javvaNUR", "sennur");
        hm1.put("javaSU", "ayse");
        System.out.println("hm1 putAll() öncesi = " + hm1);//{javvaNUR=sennur, javaNAZ=sebinem, javaTAR=busura, javaCAN =abdullah, javaSU=ayse}

        hm.putAll(hm1);
        System.out.println("hm putAll() sonrası  = " + hm);//{javvaNUR=sennur, Apple=450 Euro, javaNAZ=sebinem, Saturn=200 Euro, Teknosa=333 Euro, javaTAR=busura, Media Markt=444 Euro, javaCAN =abdullah, javaSU=ayse, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm1 putAll() sonrası = " + hm1);//{javvaNUR=sennur, javaNAZ=sebinem, javaTAR=busura, javaCAN =abdullah, javaSU=ayse}

        HashMap<String, String> hm3 = hm1;//hm1 key value hm3 atandı
        System.out.println("hm3 = " + hm3);//{javvaNUR=sennur, javaNAZ=sebinem, javaTAR=busura, javaCAN =abdullah, javaSU=ayse}
        System.out.println("hm1 = " + hm1);//{javvaNUR=sennur, javaNAZ=sebinem, javaTAR=busura, javaCAN =abdullah, javaSU=ayse}

        HashMap<String,String> hm4=new HashMap<>(hm3);//hm3 key value hm4 e atandı
        System.out.println("hm4 = " + hm4);//{javvaNUR=sennur, javaCAN =abdullah, javaNAZ=sebinem, javaSU=ayse, javaTAR=busura}

    }
}
