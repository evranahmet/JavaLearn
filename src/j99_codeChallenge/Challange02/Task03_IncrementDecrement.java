package j99_codeChallenge.Challange02;

public class Task03_IncrementDecrement {
    public static void main(String[] args) {
    /*
      Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
      Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
     */
        System.out.println("   ***   Arttırma   ***   ");
        int a = 34;
        System.out.println("a = " + a);//
        System.out.println("++a = " + ++a);//
        System.out.println("a++ = " + a++);//
        System.out.println("a = " + a);//


        System.out.println("   ***   Azaltma   ***   ");

        int b = 4;
        System.out.println("b = " + b);// 4
        System.out.println("--b = " + --b);// 3
        System.out.println("b-- = " + b--);// 3
        System.out.println("b = " + b);// 2

        int x=20;
        int y=15;
        System.out.println("(++x+y--) = " + (++x + y--));//36
        System.out.println("x = " + x);//21
        System.out.println("y = " + y);//14
        System.out.println("(++x+y--) = " + (++x + y--));//36

        int k=7;
        System.out.println("(++k + k++ + k++ + --k + k-- +k) = " + (++k + k++ + k++ + --k + k-- + k));//51

    }
}
