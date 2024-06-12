package j27_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin doganGorunumlu=new Sahin();
        doganGorunumlu.kapi();//4 KAPI sedan
        doganGorunumlu.motor();//1.6 MOTOR az yakar çok kaçar
        doganGorunumlu.ykit();//TÜP yoksa eve ateş düşer
        doganGorunumlu.kaporta();//Akordion KAPORTA
        doganGorunumlu.klima();//KLİMA için Cam neyine yetmiyot
        doganGorunumlu.jant();//Jilet Ahmet JANTi giyinir
        doganGorunumlu.ebatLastik();//LASTİK gibi sundurma
        doganGorunumlu.sunroof();//non-static concrate meth obj ile call edildi-->Soğuk havada sunroof üşütür
        doganGorunumlu.sisLambasi();//non-static concrate meth obj ile call edildi-->Çekemeyen anten taksın

        DisDonanim.anten();//static meth interface ismi le call edildi

        System.out.println("DisDonanim.RENK = " + DisDonanim.RENK);//Kirmizi
        System.out.println("IcDonanim.RENK = " + IcDonanim.RENK);//Yavruağzı
        System.out.println("Lastik.RENK = " + Lastik.RENK);//Çingene pembesi
        System.out.println("IcDonanim.KUMAS = " + IcDonanim.KUMAS);//Kadife;
        System.out.println("IcDonanim.MUSİC = " + IcDonanim.MUSİC);//Selvi boylum
    }

    }

