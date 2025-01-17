package j101_interviewQuestions;

import java.util.Arrays;
import java.util.Random;



public class Q42_CreateMethodWithArray {

    /*    ||This Part Should be in Main Method||

         -Create an array of size 5, assign some random values from 0 to 10
         -(use random class and for loop to assign values)


        ||You should create public static void methods fori loop (Parameter should be int Array for methods)||

         -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
         -2-Create a method that prints the sum of an array
         -3-Create a method that prints the max element of an array

        P.S: Return type should be void because we are not returning anything just printing

         -5 boyutunda bir dizi oluşturun, 0'dan 10'a kadar rastgele değerler atayın
         -(değerleri atamak için random sınıfını ve for döngüsünü kullanın)
          fori döngüsü için genel statik void method oluşturmalısınız (method için parametre int Array olmalıdır)
          1-"2 3 1 10 2" gibi bir dizi yazdıran bir method oluşturun, array elemanları arasında boşluk olmalı
          2-Bir arrayın toplamını yazdıran bir method oluşturun
          -3-Bir arrayın maksimum elemanını yazdıran bir method oluşturun P.S: return tipi void olmalıdır çünkü sadece yazdırılan herhangi bir şeyi iade etmiyoruz
            */
    public static void main(String[] args) {

        // Integer arr[] = new Integer[5];// 5 elemanlı bos int arr tanımlandı
        // Random rnd = new Random();

        // for (int i = 0; i < 5; i++) {
        //     arr[i] = rnd.nextInt(10);//0-10 arası int değerler ar elamanları olarak atandı
        // }
        //System.out.println(Arrays.toString(arr));
        createArray();//5 elemanlı int arr  veren metod
        System.out.println(Arrays.toString(createArray()));//
        printArray(createArray());
        System.out.println("Arr eleman toplamı : "+toplaArray(createArray()));
        System.out.println("Arr max eleman : "+maxElementArray(createArray()));
    }//main sonu

    private static  Integer [] createArray() {
        Integer sayiArr[] = new Integer[5];// 5 elemanlı bos int arr tanımlandı
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            sayiArr[i] = rnd.nextInt(10);//0-10 arası int değerler ar elamanları olarak atandı
        }
        return sayiArr;
    }

    private static int maxElementArray(Integer[] arr) {
        int maxSayi=arr[0];

        for (Integer avuc:arr ) {
            maxSayi=Math.max(maxSayi,avuc);
        }
        return maxSayi;
    }

    private static int toplaArray(Integer[] arr) {
        int toplam=0;
        for (Integer avuc:arr ) {
            toplam+=avuc;
        }
        return toplam;
    }

    private static void printArray(Integer[] arr) {
        // for (Integer avuc:arr ) {
        //     System.out.print(avuc+" ");
        // }
        // System.out.println();//dummy
        System.out.println(Arrays.toString(arr));

    }
}
