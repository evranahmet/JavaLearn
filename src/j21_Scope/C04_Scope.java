package j21_Scope;

import j20_StaticKeyword.C03_StaticKeyword;

public class C04_Scope {
    public static void main(String[] args) {
        C01_InstanceVariable obj1=new C01_InstanceVariable();//istenilen class'tan const call edilerek obj cerate edilebilir
        C03_StaticKeyword obj2=new C03_StaticKeyword();
        obj1.nonStaticMeth();//obj ile non-static meth call edildi
        System.out.println("obj1.developer = " + obj1.developer);//obj ile obj variable call edildi
        C01_InstanceVariable.staticMeth();//Class name ile static meth call edildi

    }
}
