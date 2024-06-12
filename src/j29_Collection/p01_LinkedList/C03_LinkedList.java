package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("balcanKebap", "Cüger", "haşhaşKebap", "guzuGerdan", "incik", "küşşşleme"));
        System.out.println("ll1 ilk hali = " + ll1);//[balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]
        //LinkedList remove
        System.out.println("ll1.remove() = " + ll1.remove());//balcanKebap
        System.out.println("ll1 remove sonrası = " + ll1);//[Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]
        System.out.println("ll1.remove(\"GuzuGerdan\") = " + ll1.remove("GuzuGerdan"));//false
        System.out.println("ll1.remove(\"GuzuGerdan\") = " + ll1.remove("guzuGerdan"));//true
        System.out.println("ll1 remove sonrası = " + ll1);//[Cüger, haşhaşKebap, incik, küşşşleme]
        System.out.println("ll1.removeFirst() = " + ll1.removeFirst());//Cuger
        System.out.println("ll1 remove sonrası = " + ll1);//[haşhaşKebap, incik, küşşşleme]
        System.out.println("ll1.removeLast() = " + ll1.removeLast());//küşşşleme
        System.out.println("ll1 remove sonrası = " + ll1);//[haşhaşKebap, incik]

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("trileçe", "künefix", "sübye", "suMuhallebi", "kerebis", "ayva"));
        ll1.addAll(ll2);
        System.out.println("ll1 addAll sonrası = " + ll1);//[haşhaşKebap, incik, trileçe, künefix, sübye, suMuhallebi, kerebis, ayva]
        System.out.println("ll2 = " + ll2);//[trileçe, künefix, sübye, suMuhallebi, kerebis, ayva]

        ll1.removeAll(ll2);
        System.out.println("ll1 removeAll() sonrası = " + ll1);//[haşhaşKebap, incik]
        System.out.println("ll2.element() = " + ll2.element());//trileçe

        //LinkedList get()-->getFirst()-->getLast()
        System.out.println("ll2.get(3) = " + ll2.get(3));//suMuhallebi
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//trileçe
        System.out.println("ll2.getLast() = " + ll2.getLast());//ayva

        LinkedList<Integer> sayiList=new LinkedList<>(Arrays.asList(1,2,5,6,54,67));
        System.out.println("sayiList.remove(5) = " + sayiList.remove(5));//67
        // remove() meth parametre integer alırsa List data Type integer oldugunda meth parametre obj değil index tanımlar.
        // System.out.println("sayıList.remove(45) = " + sayıList.remove(45));//RTE ->IndexOutOfBoundsException

    }
}
