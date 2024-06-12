package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        //nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar

        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        List<String> isimList=new ArrayList<>(Arrays.asList("saim","savfet","Halit","semra","seher","Enes"));

        List<String> yeniList=new ArrayList<>(Collections.nCopies(7,"JavaCAN"));
        System.out.println("yeniList = " + yeniList);

        //addAll(list) -->parametre olarak girilen listi istenen liste ekler.
        System.out.println("ulkeList = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]
        System.out.println("isimlList = " + isimList);//[saim, savfet, Halit, semra, seher, >Enes]
        ulkeList.addAll(isimList);
        System.out.println("ulkeList = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya, saim, savfet, Halit, semra, seher, >Enes]

        isimList.addAll(3,yeniList);
        System.out.println("isimList = " + isimList);//[saim, savfet, Halit, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, semra, seher, Enes]
    }
}
