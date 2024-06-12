package j24_Inheritance.inheritance02;

public class Runner {
    public static void main(String[] args) {
        //DataType  obje= Const
        Kedi      k1=   new Kedi();//kedi class data type obj create edildi
        System.out.println("k1.a = " + k1.a);//0
        System.out.println("k1.c = " + k1.c);//2
        System.out.println("k1.d = " + k1.d);//7
        System.out.println("k1.m = " + k1.m);//1

        Memeliler k2=new Kedi("beyaz");
        System.out.println("k2.a = " + k2.a);//0
        System.out.println("k2.c = " + k2.c);//4
        //System.out.println("k2.d= "+k2.d);//->CTE->dataType Memeliler class'da ve parent(Hayvanlar) class'da d variable tanimli olmadigi icin
        System.out.println("k2.m = " + k2.m);//1

        Hayvanlar k3=new Kedi("poncik");//hayvanlar datatype obje cretae edildi
        System.out.println("k3.a = " + k3.a);//0
        System.out.println("k3.m = " + k3.m);//3
        //System.out.println("k3.c = " + k3.c);//->CTE->dataType Memeliler class'da ve parent(Hayvanlar) class'da d variable tanimli olmadigi icin
        //System.out.println("k3.d = " + k3.d);//->CTE->dataType Memeliler class'da ve parent(Hayvanlar) class'da d variable tanimli olmadigi icin

        /*
 Ahan da trick köşesinde böğün->inherit edilmiş herhangi bir obj varaible  Data type göre call edilir
 Variable araştırmaya data type Class'dan başlanıp parentlere gidilir.
 */
        System.out.println("*****");
        k1.mA();//mA-> Hayvanlar class meth call edildi
        k1.mC();//mC->Kedi class meth call edildi
        k1.mM();//mM-> Memeliler class meth call edildi
        System.out.println("*****");
        k2.mA();//mA-> Hayvanlar class meth call edildi
        k2.mC();//mC->Kedi class meth call edildi
        k2.mM();//mM-> Memeliler class meth call edildi
        System.out.println("*****");
        k3.mA();//mA-> Hayvanlar class meth call edildi
        k3.mM();//mM-> Memeliler class meth call edildi
        //k3.mC();//CTE->mC kendi clasinda ve parentte olmayan meth cagirilamadi

        /*
 Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj methodları  cons. göre call edilir
 method araştırmaya cons. Class'dan başlanıp parentlere gidilir
 */

    }
}
