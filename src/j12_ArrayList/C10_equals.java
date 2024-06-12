package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_equals {
    public static void main(String[] args) {

        //equals()-> iki listin hem index hem de value (değer) eşitliğini kontrol eder true/false return eder

        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        ArrayList<String> ulkeList2=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));

        System.out.println("ulkeList.equals(ulkeList2) = " + ulkeList.equals(ulkeList2));//true
        System.out.println("ulkeList2.equals(ulkeList) = " + ulkeList2.equals(ulkeList));//true

        ulkeList2.set(1,"Kuba");
        System.out.println("ulkeList.equals(ulkeList2) = " + ulkeList.equals(ulkeList2));//false
        String[] arr={"Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"};
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//        System.out.println("ulkeList.equals(arr) = " + ulkeList.equals(arr));
    }
}
