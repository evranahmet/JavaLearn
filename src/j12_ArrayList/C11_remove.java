package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C11_remove {
    public static void main(String[] args) {

        //remove()-> list'te istenen elemanı siler

        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));

        System.out.println("remove öncesi ulkeList = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]
        System.out.println("ulkeList.remove(1) = " + ulkeList.remove(1));//Isvec
        System.out.println("remove sonrası ulkeList = " + ulkeList);//[Alamanya, Danimarka, Belcika, Hollanda, Finlandiya]

        //trick bilgi-->remove(index) silinen elemanı return eder-->kelle döndürür
        //remove(eleman)-->silinen elemanın varlığına göre true/false return eder.

        System.out.println("ulkeList.remove(\"Isvec\") = " + ulkeList.remove("Isvec"));//false
        List<String> sehirList=new ArrayList<>(Arrays.asList("Ankara","Karaman","Van","Gelibolu","Izmir"));
        ulkeList.addAll(sehirList);
        System.out.println("addAll sonrası ulkeList = " + ulkeList);//[Alamanya, Danimarka, Belcika, Hollanda, Finlandiya, Ankara, Karaman, Van, Gelibolu, Izmir]
        System.out.println("sehirList = " + sehirList);//[Ankara, Karaman, Van, Gelibolu, Izmir]
        System.out.println("ulkeList.removeAll(sehirList) = " + ulkeList.removeAll(sehirList));//true
        System.out.println("removeAll sonrası ulkeList = " + ulkeList);//[Alamanya, Danimarka, Belcika, Hollanda, Finlandiya]

        System.out.println("removeAll öncesi sehirList = " + sehirList);//[Ankara, Karaman, Van, Gelibolu, Izmir]
        System.out.println("sehirList.removeAll(sehirList) = " + sehirList.removeAll(sehirList));//true
        System.out.println("removeAll sonrası sehirList = " + sehirList);//[]

        List<Integer> sayiList=new ArrayList<>(Arrays.asList(12,14,21,43,65,4,7,67));
        System.out.println("sayiList.remove(2) = " + sayiList.remove(2));//21
   //     System.out.println("sayiList.remove(43) = " + sayiList.remove(43));//RTE-->43. index listte yok
        //sayiList.remove(43) Integer type listte remove girilen parametre list elemanı olarak degil index olarak algılanır

    }
}
