package j24_Inheritance.inheritance02;

public class Kedi extends Memeliler {//parent(super) Memeliler class'tan extends edilen child(sub) class

    int c=2;//initial int type variable
    int d=7;//initial int type variable

    public Kedi() {//p'siz default const
        super();//parent(Memeliler) class'daki p'siz const call edildi
        System.out.println("Kediler class p'siz const call edildi");
    }
    public Kedi(String str) {//1 p'li const
        this();//bu class'daki default p'siz const call edildi
        //this("str");//->CTE->recursive const call edilemez
        System.out.println("super.c = " + super.c);//parent(Memeliler) class'daki c variable call edildi
        System.out.println("Kediler class 1 p'li const call edildi");
    }

    @Override//annotation->dipnot->overriden(ezilen) meth ile override(ezen) meth iliskilendirildi
    public void mC() {
        System.out.println("mC->Kedi class meth call edildi");
    }

    @Override
    public String toString() {
        return
                "c=" + c +
                        ", d=" + d +super.toString();

    }
}

