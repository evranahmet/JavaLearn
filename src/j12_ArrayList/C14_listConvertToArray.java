package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C14_listConvertToArray {
    public static void main(String[] args) {

        //listi arraya çevirme-->toArray()
        //1. yontem -> toArray(new String[0]); toArray() parametre olarak String[0] olarak eklenir..

        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        System.out.println("ulkeList = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]
        String[] ulkeArr=ulkeList.toArray(new String[0]);//ulkeListin elemanları ulkeArr'ye eklendi.
        System.out.println("Arrays.toString(ulkeArr) = " + Arrays.toString(ulkeArr));//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]

        //2. yöntem -> tanımlanan Array'in data type Object(Hz Adem Class) olarak tanımlanır
        //Trick-> Object(Hz. Adem Class) java'da tanımlı tum Class'ların atası(parenti) olarak tanımlıdır
        //String Integer Double.. etc. Class'lar Object Class için child(evlat)oldugu için istenen durumlarda data type olarak kullanılır.

        Object[] ulkeArr1=ulkeList.toArray();
        System.out.println("Arrays.toString(ulkeArr1) = " + Arrays.toString(ulkeArr1));//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]

    }
}
