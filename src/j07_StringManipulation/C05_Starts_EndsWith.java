package j07_StringManipulation;

import java.util.Scanner;

public class C05_Starts_EndsWith {
    public static void main(String[] args) {
        /*
 startsWith()
 Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 String'in basladigi characteri dogrular
 endsWith()
 Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
*/
        String str1="ebikGabik";
        System.out.println("str1 = " + str1);
        //str1.startsWith('e');//parametre olarak char degeri almaz-->CTE
        System.out.println("str1.startsWith(\"e\") = " + str1.startsWith("e"));//true
        System.out.println("str1.startsWith(\"ebik\") = " + str1.startsWith("ebik"));//true
        String str2="ebik";
        System.out.println("str1.startsWith(str2) = " + str1.startsWith(str2));//true
        System.out.println("str2.startsWith(str1) = " + str2.startsWith(str1));//false
        System.out.println("str2.startsWith(str2) = " + str2.startsWith(str2));//true

        System.out.println("str2.endsWith(str1) = " + str2.endsWith(str1));//false
        System.out.println("str1.endsWith(str1) = " + str1.endsWith(str1));//true

        System.out.println("str1.startsWith(\"k\",3) = " + str1.startsWith("k", 3));//true

        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
// @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("G-mailinizi giriniz");
        String gmail=scan.next();
        //1.yol
//        if (gmail.endsWith("@gmail.com")){
//            System.out.println("hesabınız onaylandı");
//        }else System.out.println("lütfen gmail hesabı giriniz");

        //2.yol
        System.out.println(gmail.endsWith("@gmail.com")?"hesabınız onaylandı":"lütfen gmail hesabı giriniz");

    }
}