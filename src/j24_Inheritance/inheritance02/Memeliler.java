package j24_Inheritance.inheritance02;

public class Memeliler extends  Hayvanlar{//grand-parent Hayvanlar class'tan extends edile parents class
    int m=1;//initial edilmiş int type variable
    int c=4;//initial edilmiş int type variable

    public Memeliler() {//default p'siz const
        this('H');//bu class'taki p'li const call edildi
        System.out.println("memeliler class p'siz const call edildi");
    }
    public Memeliler(char v) {//default p'siz const
        super(34);//parent class'taki p'li const call edildi
        System.out.println("memeliler class 1 p'li const call edildi");
    }

    public void mC(){
        System.out.println("mC-->Memeliler class meth call edildi");
    }

    //@Override//-->anotation-->dipnot demek
    public void mM() {//parent'ten ezilen meth
        System.out.println("mM-->Memeliler class meth call edildi");
    }


}
