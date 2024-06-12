package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_set {
    public static void main(String[] args) {

        //set()-> listin istenen index'te istenen elemanını  update set eder-> şu indexin şu elelmanını şununla değiştir...

        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));

        System.out.println("ulkeList set yapılmadan önce = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]
        System.out.println("ulkeList.set(2,\"Izlanda\") = " + ulkeList.set(2, "Izlanda"));//Danimarka
        System.out.println("ulkeList set yapıldıktan sonra = " + ulkeList);//[Alamanya, Isvec, Izlanda, Belcika, Hollanda, Finlandiya]

        //System.out.println("ulkeList.set(7,\"Türkiye\") = " + ulkeList.set(7, "Türkiye"));//-->RTE IndexOutOfBoundsException lenght 6 da bitiyor

        //ulkeList.set(3,"Fransa",4,"Romanya");//-->CTE set() çoklu parametre aldığı için derleme (compile) yapmadı



    }
}
