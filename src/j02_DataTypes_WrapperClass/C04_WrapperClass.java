package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {//class level

    /*
       Note: Java primitive lere method'lar ekleyerek yeni bir
             yapi olusturdu, bu yapiya "Wrapper Class"
             Primitive         Wrapper
                byte     ==>    Byte
                short    ==>    Short
                ** int   ==>    Integer
                long     ==>    Long
                float    ==>    Float
                double   ==>    Double
                boolean  ==>    Boolean
                ** char  ==>    Character
    */

    public static void main(String[] args) {//main level
        /*
        Java'da bir degiskenin hangi data type baglı oldugunu bulmak icin getClass() methodu kullanılır.
        bu method hangi class'tan üretildiyse onu verir.
         */
        String str="JavaCAN";
        int yas=45;
        double pi=3.14;
        System.out.println(str.getClass());//class java.lang.String
        //System.out.println(yas.getClass());//CTE-> yas primitive old icin class ı yoktur.
        //System.out.println(pi.getClass());//CTE-

        /*
        Integer.valueOf(yas) veya Double.valueOf(pi) ifadeleri kullanılarak ilkel veri tipleri
        Wrapper class a donusturulur getClass methofu kullanılabilir.
         */

        String isim="safvet";
        System.out.println("isim = " + isim);
        System.out.println("isim.toUpperCase() = " + isim.toUpperCase());

        /*
        non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
ancak primitive data turlerinin boyle bir ozelligi yoktur
primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
ara çözüm imkanı sunmuştur.
         */

        // task-> id ve tc String değerlerini toplamını print code create ediniz..

        String id="12345";
        String tc="1234567";
        System.out.println(id+tc);//concat işlemi (yanyana yazma) yapar.
        Integer yeniID=Integer.parseInt(id);//String olan id Integer a cevrildi
        System.out.println("yeniID = " + yeniID);
        Integer yeniTC=Integer.parseInt(tc);//String olan id Integer a cevrildi
        System.out.println("yeniTC = " + yeniTC);
        System.out.println("Toplam = " + (yeniTC+yeniID));

        String okulNo="3435a";
        //int okulNosu:"3435a";//CTE
        //int yeniOkulNo=Integer.parseInt(okulNo);//okulNo integere atandı->Run time Exception hatası
       // System.out.println(yeniOkulNo);
        


        // task-
        
        byte bytMaxDeger=Byte.MAX_VALUE;
        byte bytMinDeger=Byte.MIN_VALUE;
        System.out.println("bytMinDeger = " + bytMinDeger);
        System.out.println("bytMaxDeger = " + bytMaxDeger);
        System.out.println("Short.MAX_VALUE"+Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE"+Short.MIN_VALUE);
        System.out.println(" Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println(" Integer.MIN_VALUE = " + Integer.MIN_VALUE);








    }//main sonu
}//clqss sonu
