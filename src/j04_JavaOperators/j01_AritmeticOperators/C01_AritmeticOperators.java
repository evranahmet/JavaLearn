package j04_JavaOperators.j01_AritmeticOperators;

public class C01_AritmeticOperators {//class level

    public static void main(String[] args) {//main menü

        int a=13;
        int b=17;
        int c=47;
        System.out.println(a+b*c);//812
        System.out.println(b+a*c);//628
        //3

        System.out.println("b+(c-2*a)/2 = " + (b + (c - 2 * a) / 2));//27
        System.out.println("(c-a/(b-c)+a*b) = " + ((c - a / (b - c) + a * b)));//268

        int d =12;
        double e=4;
        float f=4f;
        System.out.println("d/e = " + (d / e));
        System.out.println("d+e = " + (d + e));
        System.out.println("(e/d) = " + (e / d));
        System.out.println("(f/d) = " + (f / d));
        //farkli data type ariymetic islemlerde sonuc ciktisi buyuk olanin data type olarak verilir.
        //modolus işlemi iki sayının bolumunden KALANI int olarak verir
        // cift sayı(even): 2'ye bolumunden kalan 0 olan-> sayı%2==0
        // tek sayı(odd): 2'ye bolumunden kalan 1 olan-> sayı%2==1

        int g = 2;
        int h = 3;
        String s = "javaCAN";
        //Task -> g h s variable  kullanarak 61javaCAN-1 print eden code create ediniz.
        System.out.println((g*h)+"" + (h-g)+"javaCAN" + (g-h));



    }//main sonu
}//class sonu
