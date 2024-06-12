package j04_JavaOperators.J03_Comparison_Karsilastırma_Operators.SORULAR;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

    /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("Lütfen 2 sayı giriniz: ");

        double num1 = dp.nextDouble();
        double num2 = dp.nextDouble();
        System.out.println("1. sayı 2. sayıya eşit mi? = " + (num1 == num2));

        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
    }
}
