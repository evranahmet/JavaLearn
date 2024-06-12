package j04_JavaOperators.j04_Logical_Mantiksal_Operators;

public class C01_MantıksalOperator {//class level
     /*
-------- && - and - (ve)---------

     True   &&    True    -->  True
     True   &&    False   -->  False
     False  &&    True    -->  False
     False  &&    False   -->  False


    -------- ||- or - (veya)---------

     True   ||    True    -->  True
     True   ||    False   -->  True
     False  ||    True    -->  True
     False  ||    False   -->  False
*/
    // && ile & arasindaki fark
    //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calısmaz.
    // Ancak & tum satırı kontrol eder ondan sonra durur.
    //sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri sonuna kadar gider.&& tekliye gore daha hizli calisir

    //and->ve or->veya

    public static void main(String[] args) {//main menü
        boolean b1=Math.pow(2,3)>Math.pow(3,2);//false
        boolean b2=10<13;//true
        int c=30;
        int d=20;
        System.out.println("(b1&&(d<c)) = " + (b1 && (d < c)));//f&&t-->false
        System.out.println("(b2&&(c==d)) = " + (b2 && (c == d)));//t&&f-->false
        System.out.println("(b2||(c<d)) = " + (b2 || (c < d)));//t||f-->true
        System.out.println("(b1||(c==d)) = " + (b1 || (c == d)));//f||<-->false
        System.out.println("!(b1) = " + !(b1));//true
        System.out.println("!(b2) = " + !(b2));//false

    }//main sonu
}//class sonu
