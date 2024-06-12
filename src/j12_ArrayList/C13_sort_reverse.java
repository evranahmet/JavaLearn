package j12_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C13_sort_reverse {
    public static void main(String[] args) {

        //sort():-> list elemanlarını doğal (NATUREL ORDER) sıralama yapar,

        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        System.out.println("sort öncesi ulkeList = " + ulkeList);
        Collections.sort(ulkeList);
        System.out.println("sort sonrasi ulkeList = " + ulkeList);//[Alamanya, Belcika, Danimarka, Finlandiya, Hollanda, Isvec]
        //reverse() meth list elemanlarını index'e göre ters sıralar
        List<Integer> sayiList = new ArrayList<>(List.of(23,12,21,62,49,11,7,16));
        System.out.println("reverse oncesi sayiList = " + sayiList);//[23, 12, 21, 62, 49, 11, 7, 16]
        Collections.reverse(sayiList);
        System.out.println("reverse sonrasi sayiList = " + sayiList);//[16, 7, 11, 49, 62, 21, 12, 23]System.out.println("sort sonrası ulkeList = " + ulkeList);
    }
}
