package j99_codeChallenge.Challenge08_Cevaplar;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
		/* task->
        verilen bir int array icin elemanlarin karelerini print eden code create ediniz.
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */


        int arr[] = {2, 6, 4, 5, 8, 9};
        System.out.println("array elements: " + Arrays.toString(arr));//[2, 6, 4, 5, 8, 9]
        int arr1[]=new int[arr.length];// boş bir array tanımlandı
        for (int i = 0; i < arr.length; i++) {//arr elemanlarını tekrara alan bir loop tanımlandı
          arr1[i] = arr[i]*arr[i];

        }
        System.out.println("array elements: " + Arrays.toString(arr));//[2, 6, 4, 5, 8, 9]
        System.out.println("array1 elements: " + Arrays.toString(arr1));//[4, 36, 16, 25, 64, 81]


    }// main sonu


}// Class sonu
