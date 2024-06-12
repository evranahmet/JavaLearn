package j04_JavaOperators.j02_Assaignment_Atama_Operators;

public class C01_AtamaOperatoru {//class level

    //    =         x = 8      x = 8
    //    +=        x += 3     x = x + 3
    //    -=        x -= 3     x = x - 3
    //    *=        x *= 3     x = x * 3
    //    /=        x /= 3     x = x / 3
    //    %=        x %= 3     x = x % 3

    public static void main(String[] args) {//main menü

        int saimYas=48;
        System.out.println("saimYas = " + (saimYas+5));//53  -> atama yapılmadıgı icin saimYas degismedi
        System.out.println("saimYas = " + saimYas);//48   -> atama yapılmadıgı icin saimYas degismedi
        System.out.println("saimYas = " + (saimYas += 11)); //59
        System.out.println("saimYas = " + saimYas);//59 -> atama yapıldıgı icin saimYas degisti
        System.out.println("saimYas%=5 = " + (saimYas %= 5));//4
        System.out.println("saimYas = " + saimYas);//4



    }//main sonu
}//class sonu
