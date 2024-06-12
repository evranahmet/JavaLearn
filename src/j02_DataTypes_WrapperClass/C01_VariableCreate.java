package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {//class level
    /*Variable
              bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
              Variable icinde deger saklayan bir container'dir
              bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
              örneğin bir okulun öğrenci sayısı için variable data türü String,boolean,char veya double alınmamalı.
              geriye kalan tamsayı  turlerınden okulun öğrenci sayısını içine alabilecek büyüklükte bir data turu secilir
              *** genelde tam sayılar için int ondalıklı sayılar için double kullınılır..
              */
    public static void main(String[] args) {//main level
        //variable create (değişken oluşturmak) için...
        //1-Data Type (değişken türü)     2-Veriable name(değişken ismi)   '=' 3-value (değişken değeri)
                       int                      selimYas                    =     35; //memory'de int type selimYas isminde 35 değerinde bir variable (değişken) oluşturuldu.
                        //declaration(tanımlama)                            =assaigmant(atama)
        //1. yol -> best practice (recommended ->tavsiye edilen)
        int yas =33;
        int maas=100000;
        System.out.println(yas);//33
        System.out.println("yas");//yas

        System.out.println("selimYas = "+selimYas);


        //2.yol
        int boy;//int data type boy adında bir variable tanımlandı->declaration
        //System.out.println(boy);
        boy=190;//öncesinde declaration edilen variableye değer ataması (assaigment) yapıldı

        //3.yol
        int yevmiye,kilo,tecrübe;//birden çok aynı türde variable tanımlandı->declaration
        yevmiye=400;
        kilo=90;
        tecrübe=7;//öncesinde declaration edilen variableye değer ataması (assaigment) yapıldı
        //cincix kod
        int günlük=550,ağırlık=88,experiance=10;//birden çok aynı türde variable tanımlandı->declaration ve değer atandı
        System.out.println("günlük = "+günlük+ " ağırlık = "+ağırlık+" tecrube = "+experiance);
        //hata->öncesinden tanımlanmış bir variable tekrar tanımlanamaz-> CTE hatası verir.
        //int yas=58;//CTE ->already exist daha önce tanımlanmış
        yas=58;//tanimlanmis olan variable yeniden deger atamasi yapildi->deger degisti



    }//main sonu
}//class sonu
