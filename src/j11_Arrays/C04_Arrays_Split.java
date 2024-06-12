package j11_Arrays;

import java.util.Arrays;

public class C04_Arrays_Split {
    public static void main(String[] args) {
        // String data type dataları Arrays'e elaman olarak cevirmek için split() meth kullanılır.
        String  str="javaNAZ'lara bolcana selamkeee. taskları çözmeyenin klayveyisi bozulsun ekranı mavi caksın :( ";

        // task-> str'nin kelime ve harf sayısını print eden code create ediniz.
        String kelimeArr[]=str.split(" ");
        System.out.println("Arrays.toString(kelimeArr) = " + Arrays.toString(kelimeArr));
        System.out.println("str'nin kelime sayısı = " + kelimeArr.length);//11

        String harfArr[]=str.replaceAll("\\W","").split("");
        System.out.println("Arrays.toString(harfArr) = " + Arrays.toString(harfArr));
        System.out.println("str'nin harf sayisi : "+harfArr.length);
        char[] krktrArr=str.replaceAll("\\W","").toCharArray();
        System.out.println("Arrays.toString(krktrArr) = " + Arrays.toString(krktrArr));

    }
}
