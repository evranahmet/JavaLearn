package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_subList {
    public static void main(String[] args) {
        //sublist() -> listini istenen list parcasını(şu index'ten şu index'e parcasını) return eder

        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        System.out.println("sub list öncesi ulkeList = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]

        System.out.println("ulkeList.subList(1,4) = " + ulkeList.subList(1, 4));//[Isvec, Danimarka, Belcika]

        System.out.println("sub list sonrası ulkeList = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]

        List<String> yeniList=new ArrayList<>(ulkeList.subList(2,ulkeList.size()));//2. indexten listin sonuna kadar
        System.out.println("yeniList = " + yeniList);//[Danimarka, Belcika, Hollanda, Finlandiya]
    }
}
