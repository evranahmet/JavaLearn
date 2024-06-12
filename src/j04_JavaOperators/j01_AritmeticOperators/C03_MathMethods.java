package j04_JavaOperators.j01_AritmeticOperators;

public class C03_MathMethods {//class level

    /*
     Math.abs(a)
     Girilen degerin mutlak degerini verir.

    Math.max(a, b)
    Girilen iki degerden buyuk olani verir.

    Math.min(a, b)
    Girilen iki degerden kucuk olani verir.

    Math.round(a)
    Girilen degerin en yakin tamsayiya yuvarlar.

    Math.sqrt(a)
    Girilen degerin karekokunu verir.

    Math.pow(a, b)
    Girilen a ve b degerini a uzeri b olarak verir.

    Math.ceil(a) 3.1 => 4
    Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

    Math.floor(a) 3.7 => 3
    Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.
     */

    public static void main(String[] args) {//main menü

        //task-> 81'in karekokunu print eden code create ediniz

        System.out.println(Math.sqrt(81));
        //Math.abs
        System.out.println("Msth.abs(-55) =" + Math.abs(-55));
        //Math.max
        System.out.println("Math.max(24,65) = " + Math.max(24, 65));
        //Math.min
        System.out.println("Math.min(24,65) = " + Math.min(24, 65));
        //Math.round
        System.out.println("Math.round(19.03) = " + Math.round(19.03));
        System.out.println("Math.round(19.57) = " + Math.round(19.57));
        //Math.ceil
        System.out.println("Math.ceil(19.99) = " + Math.ceil(19.99));
        System.out.println("Math.ceil(19.01) = " + Math.ceil(19.01));
        //Math.floor
        System.out.println("Math.floor(19.99) = " + Math.floor(19.99));
        System.out.println("Math.floor(19.01) = " + Math.floor(19.01));
        //Math.pow
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));
        System.out.println("Math.pow(-2,4) = " + Math.pow(-2, 4));
        //Math.random-> rastgele 0 ile 1 arasında double bir sayı verir
        System.out.println("Math.random() = " + Math.random());
        int rastgeleSayi= (int) (Math.random()*100);
        System.out.println("rastgeleSayi = " + rastgeleSayi);


    }//main sonu
}//class sosnu
