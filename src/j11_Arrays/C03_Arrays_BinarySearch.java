package j11_Arrays;

import java.util.Arrays;

public class C03_Arrays_BinarySearch {
    public static void main(String[] args) {

        // Arrays.binarySearch(arr,value);-> girilen arraydeki istenen eleman kontrolu

        int sayiArr[]={23,44,2,11,55,60,32,34,58,22,9,64,42};
        int sayi1=44;
        int sayi2=20;
        System.out.println("***Amele kod***");
        boolean flag=false;//bayrak aşağı
        for (int i = 0; i <sayiArr.length ; i++) {
            if (sayiArr[i]==sayi2){
                flag=true;//bayrak yukarı
                break;
            }

        }
        System.out.println(flag?"aradiginiz sayı arreyde mevcut":"aradiginiz sayi arreyde mevcut degil");
        System.out.println("***cincix kod***");
        //Arrays.sort(sayiArr);//sort işlemi yapıldı küçükten büyüğe sıralandı.
        System.out.println("Arrays.toString() = " + Arrays.toString(sayiArr));
        System.out.println("Arreyde 20'nin varlığı : " +Arrays.binarySearch(sayiArr,sayi2) );
        System.out.println("Arreyde 44'nin varlığı : " +Arrays.binarySearch(sayiArr,sayi1) );

    }
}
