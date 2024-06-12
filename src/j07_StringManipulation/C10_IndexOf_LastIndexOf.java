package j07_StringManipulation;

import java.util.Scanner;

public class C10_IndexOf_LastIndexOf {//class level
    public static void main(String[] args) {//main menü

        /* indexOf()->aranan yolcunun koltuk numarasını verir
  char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
  Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false
*/
        String str="madem geldin dunyaya calis JAVA'ya";
        System.out.println("str.indexOf('y') = " + str.indexOf('y'));//16 y karakterinin str daki indexini reurn eder
        System.out.println("str.indexOf(\"e\") = " + str.indexOf("e"));//3 e 'nin ilk gorundugu yerin indexini return eder
        //Metinden bir kelimein indexi arandigi zaman kelimeyi ilk buldugu yerin ilk indexini return eder
        System.out.println("str.indexOf(\"JAVA\") = " + str.indexOf("JAVA"));//27
        System.out.println("str.indexOf(\"java\") = " + str.indexOf("java"));//-1
        //hap bilgi indexOf meth olmayan bir char veya String arandigi zaman CTE veya RTE hatasi vermez -1 return eder
        System.out.println("str.indexOf(\"a\",12) = " + str.indexOf("a", 12));

        /* lastIndexOf()
         String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         indexOf un sondan olan hali fakat index numaraları değişmez.
         lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */
        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));//33
        System.out.println("str.lastIndexOf('x') = " + str.lastIndexOf('x'));//-1 YOKSA -1 OLUR
        System.out.println("str.lastIndexOf('s') = " + str.lastIndexOf('s'));//25
        System.out.println("str.length() = " + str.length());//34

         /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
        a-) girilen ifade java içermiyor
        b-) girilen ifade 1 adet java içeriyor
        c-) girilen ifade  1'den çok java içeriyor
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin=scan.nextLine().toLowerCase();
       // if (metin.indexOf("java")==-1)
        if (!metin.contains("java")){
            System.out.println("Girilen metin java içermiyor");

        } else if (metin.indexOf("java")==metin.lastIndexOf("java")) {
            System.out.println("Girilen metinde java bir defa kullanılmış");

        }else System.out.println("Girilen ifade birden fazla java içeriyor");


    }//main sonu
}//class sonu
