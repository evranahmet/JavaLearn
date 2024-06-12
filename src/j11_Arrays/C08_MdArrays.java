package j11_Arrays;

public class C08_MdArrays {
    public static void main(String[] args) {
        //Task-> int arr[][]={
//                {3,5},//0. kat
//                {12,13,15},//1. kat
//                {103,107,111,121},//2. kat
//        };
//        array elamanları toplamını print eden code create ediniz.

        int arr[][]={
                {3,5},//0. kat
                {12,13,15},//1. kat
                {103,107,111,121},//2. kat
        };
        int toplam=0;//arrayin elemanlarınn toplanacağı boş kutu
        for (int kat = 0; kat <arr.length ; kat++) {//kat tekrarı-->outer loop
            for (int daire = 0; daire <arr[kat].length ; daire++) {//daire tekrarı-->inner loop
                toplam+=arr[kat][daire];
            }

        }
        System.out.println("toplam = " + toplam);

    }
}
