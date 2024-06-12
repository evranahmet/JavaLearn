package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {//class level
    //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
//Scanner Class'i Java nin util kutuphanesindedir.

// kullanıcıdan veri almak içinn şu adım takip edilir
//1. adım-> Scanner class'dan obj create edilir.

//  Scanner input = new Scanner(System.in);// Scanner classından input isminde değerini System içinden alan bir obj.

//  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
//  System.out.print("adınızı giriniz :");

//  // 3. adım-> kulanıcının girdigi veri data type'ne göre bir variable atanır.


    public static void main(String[] args) {//main level
        // task-> kullanıcının girdigi değere göre karenin alanını print eden code create ediniz
        //1.adim Scanner obj create
        Scanner scan=new Scanner(System.in);
        //2.adim bilgilendirme
        System.out.println("Alanini istediginiz karenin bir kenarini giriniz : ");
        //3.adim Kullanicinin girdigi degeri uygun bir variableye atama
        int kenar=scan.nextInt();
        System.out.println("kenar = " + kenar);
        scan.nextLine();//Dummy
        System.out.println("Isminizi giriniz");
        String name=scan.nextLine();
        System.out.println("name = " + name);
//        int kareAlani=kenar*kenar;
//        System.out.println("kareAlani = " + kareAlani);
        System.out.println("kareAlani = " + (kenar*kenar));

        /*
 Task->
 Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
 Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
 1 seker = 1.7 gr
 Ornek : Input : cay sayisi : 10 seker sayisi :
         Output : Yilda 12.41 kg seker kullaniyorsunuz
 */

        //2. adım
        System.out.println("Günde kaç bardak cay iciyorsunuz");
        //3. adım
        int gunlukCayMiktari= scan.nextInt();
        //seker miktarı icin 2. adıma tekrar donuyoruz
        //2.adım
        System.out.println("caya kac seker atıyorsunuz");
        int sekerSayisi= scan.nextInt();
        System.out.println("Yilda "+ ((gunlukCayMiktari*sekerSayisi*1.7*365)/1000)+" kg seker kullanıyorsunuz");













    }//main sonu
}//class sonu
