package j27_Interface;

public class Sahin extends Tofask implements DisDonanim,IcDonanim,Lastik{

    @Override
    public void motor() {
        System.out.println("1.6 MOTOR az yakar çok kaçar");

    }

    @Override
    public void ykit() {
        System.out.println("TÜP yoksa eve ateş düşer");

    }

    @Override
    public void kapi() {
        System.out.println("4 KAPI sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("Akordion KAPORTA");
    }

    @Override
    public void koltuk() {
        System.out.println("Deri KOLTUK yazın sıkıntı");
    }

    @Override
    public void klima() {
        System.out.println("KLİMA için Cam neyine yetmiyot");
    }

    @Override
    public void ebatLastik() {
        System.out.println("LASTİK gibi sundurma");
    }

    @Override
    public void jant() {
        System.out.println("Jilet Ahmet JANTi giyinir");
    }
}
