package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        List<Integer> sayiList=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Listeye atamak isteginiz elemanlari giriniz\nyeterli sayiya ulasinca negatif bir deger giriniz");
        int islem=0;
        int toplam=0;
        while (islem>=0){
            System.out.println("bir sayi giriniz");
            islem= scan.nextInt();
            if (islem>0){
                sayiList.add(islem);
                toplam+=islem;
            }
        }
        System.out.println("sayiList = " + sayiList);
        System.out.println("toplam = " + toplam);
        int ort=toplam/sayiList.size();
        System.out.println("ort = " + ort);
        for (int i = 0; i < sayiList.size(); i++) {
            if (sayiList.get(i)>ort){
                System.out.print(sayiList.get(i)+" ");
            }
        }
    }


}