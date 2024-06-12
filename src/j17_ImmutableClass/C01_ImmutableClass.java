package j17_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        String str1="Sema";//ilk deger initial ataması yapılmış str1 variable String type oluştu.
        String str2="Sema";//str1 ve str2 aynı değer ile ilk ataması yapıldıgı icin StringPool dan aynı referans ile oluştu.
        String str3=new String("Sema");//ilk değer ataması Sema value ile yapıldı heap memory'de(unique referans değer create edildi)
        String str4=new String("Sema");//ilk değer ataması Sema value ile yapıldı heap memory'de(unique referans değer create edildi)
        String str5=str3;

        System.out.println("(str1 == str2) = " + (str1 == str2));//True
        System.out.println("(str3 == str5) = " + (str3 == str5));//true
        System.out.println("(str2 == str3) = " + (str2 == str3));//False

        System.out.println("str1.equals(str2) = " + str1.equals(str2));//true
        System.out.println("(str3 == str4) = " + (str3 == str4));//false
        System.out.println("str3.equals(str4) = " + str3.equals(str4));//false
        System.out.println("(str1 ==str5) = " + (str1 == str5));//false
        System.out.println("str1.equals(str5) = " + str1.equals(str5));//true
    }
}
