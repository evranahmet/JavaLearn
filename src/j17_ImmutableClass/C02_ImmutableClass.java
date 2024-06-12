package j17_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C02_ImmutableClass {
    public static void main(String[] args) {

        /*
       Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
       BigDecimal, BigInteger java'da immutable->değişmez sınıflara örnek olarak gösterilebilir.
       StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
       */

        String name="Ahmet";
        System.out.println("Immutable cls");
        System.out.println("meth call öncesi name :"+name);//Ahmet
        name.concat("Bey offer aldı hayırlı olsun");
        System.out.println("meth call sonrası name :"+name);//Ahmet
        System.out.println("Mutable class");
        List<String> isimList=new ArrayList<>();
        System.out.println("Meth call öncesi list : "+isimList);//[]
        isimList.add("Safvet");
        isimList.add("Semra");
        isimList.add("Saim");
        isimList.add("Tuba");
        isimList.remove(0);
        System.out.println("Meth call sonrası list : "+isimList);//[Semra, Saim, Tuba]

    }
}
