package j07_StringManipulation;

public class C07_IsEmpty {//class level
    public static void main(String[] args) {//main menü

        /*
 String IsEmpty
  String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
 isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
 Yani o String'in length() 0 demektir.
 length()==0 demek isEmpty() true verir demektir.
*/
        String str="madem geldin dünyaya calis Java'ya";
        System.out.println("str.length() = " + str.length());//34
        System.out.println("str.isEmpty() = " + str.isEmpty());//false
        String str1="";//hiclik-->bos arsa
        System.out.println("str1.length() = " + str1.length());//0
        System.out.println("str1.isEmpty() = " + str1.isEmpty());//true

        String str2=" ";//space 1 agac dikili
        System.out.println("str2.length() = " + str2.length());//1
        System.out.println("str2.isEmpty() = " + str2.isEmpty());//false

        String str3=null;//dutluk-->arsa bile degil
  //      System.out.println("str3.length() = " + str3.length());//RTE
  //      System.out.println("str3.isEmpty() = " + str3.isEmpty());//RTE

        //İsBlank()->hem bos yani hiclik tanımlanan String icin hem de space iceren <string icin True döner degilse false

        System.out.println("str2.isBlank() = " + str2.isBlank());//true
        System.out.println("str1.isBlank() = " + str1.isBlank());//true

        String str4="   x   ";
        System.out.println("str4.isBlank() = " + str4.isBlank());

        String str5;

        //     System.out.println("str5 = " + str5);
  //   System.out.println("str5.isEmpty() = " + str5.isEmpty()); undefined degisken hicbir aksiyona tabi tutulamaz.



    }//main sonu
}//class sonu
