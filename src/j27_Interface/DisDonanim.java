package j27_Interface;

public interface DisDonanim {
    void kapi();//public abs meth
    void kaporta();//public abs meth
    //String renk;//CTE-->final static String variable initial edilmek zorundadır.
    //public final static String renk="Kirmizi;";//initial edilmiş variable
    String RENK="Kirmizi";//public static final initial variable
    public static void anten(){
        System.out.println("Çekemeyen anten taksın");
    }
    public default String sisLambasi(){
        return "Sisli havada can kurtarır";
    }

    public static void main(String[] args) {//interfacede main tanımlanabilir fakat bad practice
        System.out.println(RENK);
        anten();//meth call
       //DisDonanim obj=new DisDonanim();//interface'nin const olmadığı için obj creat edilemez

    }

}
