package j04_JavaOperators.j01_AritmeticOperators;

public class C02_IncrementDecrement {//class level

    /*
Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
    */
    public static void main(String[] args) {//main menü
        System.out.println("***Increment - Arttirma***");
        int a=3;
        System.out.println(a);//3
        System.out.println(++a);//4 önce arttır sonra sout yap
        System.out.println(a++);//4 önce sout yap sonra a'nın degerini arttır
        System.out.println(a);//5

        a=8;
        System.out.println(a);//8
        System.out.println(a++ + ++a);//18 8+10=18
        System.out.println(++a + a++ + a++);//34   11+11+12=34
        System.out.println(a);//13

        System.out.println("***Decrement - Azaltma***");
        int b=3;
        System.out.println(b);//3
        System.out.println(b--);//3
        System.out.println(--b);//1

        int x=20;
        int y=15;
        System.out.println("*******");
        System.out.println(++x + y--);//36    21+15=36
        System.out.println(y++ + x++ + --x);//56   14+21+21=56

        int k=5;
        int sonuc=++k + k++ + --k + k-- + k;
        System.out.println("sonuc = " + sonuc);//29  6+6+6+6+5=29












    }//main sonu
}//class sonu

