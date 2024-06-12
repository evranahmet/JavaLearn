package j24_Inheritance.inheritance02;

public class Hayvanlar {//Grand-parent class

    int a;//default int type inst. variable

    int m=3;//initial int type inst. variable

    public Hayvanlar() {
        System.out.println("Hayvanlar class p'siz const call edildi");

    }
    public Hayvanlar(int x) {
        System.out.println("Hayvanlar class p'li const call edildi");

    }
    public void mA(){
        System.out.println("mA-->Hayvanlar class meth call edildi");
    }
    public void mM(){
        System.out.println("mM-->Hayvanlar class meth call edildi");
    }
}
