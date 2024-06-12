package j11_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    /*
    Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
    Array tanımlamak için:
    1- data type (Bir array'in icerisinde sadece ayni data tipinden variable olmalıdır.)
    2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

    Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
    isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
    */

    public static void main(String[] args) {
        //Array decleration
        int a;//declere edilen fakan atama yapilmayan bir variable tanimlandi
        int arr[];//declere edilen fakat atama yapilmayan bir non-primitive int type array tanimlandi
        //Trick -> tanimlanan ancak deger atanmayan bir array hicbir actiona tabi tutulamaz ->CTE
        String[] isimler={"Saim","Halid","Safvet","Abdurrahman","Yucel","Sema"};//hem declere islemi hemde atama islemi yapilan String type array tanimlandi
        int sayiArr[]=new int[5];//eleman sayisi tanimlanmis bos int type array
        int sayiArr1[]=new int[7];//eleman sayisi tanimlanmis bos int type array
        //Array'e eleman girisi->update
        sayiArr[3]=61;//3.index eleman 61 olarak update edildi
        sayiArr[4]=58;
        sayiArr[0]=55;
        sayiArr[3]=58;//3.index eleman 61 iken 58 olarak degistildi:arrayin elemanlari unique olmak zorunda degildir
        //Arrayin eleman sayisi->length
        System.out.println(sayiArr.length);//5
        System.out.println("isimler.length = " + isimler.length);//6
        //Arrayi print etme
        System.out.println("isimler = " + isimler);//Ljava.lang.String;@246ae04d
        System.out.println("sayiArr = " + sayiArr);//[I@5315b42e
        //sout(arr)-> Array non-primitive oldugu icin bu sekilde print etme bize referans degeri verir
        //sout(Arrays.toString(arr)); bu sekilde array elemanlari print edilir
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));//[Saim, Halid, Safvet, Abdurrahman, Yucel, Sema]
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));//[55, 0, 0, 58, 58]
        //System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//CTE
        System.out.println("Arrays.toString(sayiArr1) = " + Arrays.toString(sayiArr1));//[0, 0, 0, 0, 0, 0, 0]
        //Arrayin son index elemanini print etme
        System.out.println("Son index eleman : "+sayiArr[sayiArr.length-1]);//58
        // Arrayin ilk index elemanini print etme
        System.out.println("Ilk index eleman : "+sayiArr[0]);//55
        //Arrayde olmayan index elemani yazdirma
        //System.out.println(sayiArr[42]);//RTE->ArrayIndexOutOfBoundsException

        //Arrayin elemanlarini print etme->bad practice
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));//[Saim, Halid, Safvet, Abdurrahman, Yucel, Sema]
        for (int i = 0; i < isimler.length; i++) {//array elemanlari sayisi kadar tkrar tanimlandi
            System.out.print(isimler[i]+" ");//tekrardan alinan herbir array elemani print edildi->Saim Halid Safvet Abdurrahman Yucel Sema
        }
        System.out.println();
        //Arrayi natural(dogal) siralama alfabetik veya kucukten buyuge
        System.out.println("Sort oncesi ismler arr : "+ Arrays.toString(isimler));//Sort oncesi ismler arr : [Saim, Halid, Safvet, Abdurrahman, Yucel, Sema]
        Arrays.sort(isimler);//array siralandi
        System.out.println("Sort sonrasi ismler arr : "+Arrays.toString(isimler));//Sort sonrasi ismler arr : [Abdurrahman, Halid, Safvet, Saim, Sema, Yucel]

        System.out.println("Sort oncesi sayiArr : "+Arrays.toString(sayiArr));//Sort oncesi sayiArr : [55, 0, 0, 58, 58]
        Arrays.sort(sayiArr);//sort siralama yapildi
        System.out.println("Sort sonrasi sayiArr : "+Arrays.toString(sayiArr));//Sort sonrasi sayiArr : [0, 0, 55, 58, 58]

    }
}
