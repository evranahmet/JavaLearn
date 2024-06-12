package j25_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {
    public static void main(String[] args) {
        //  ArithmeticException -> matematiksel(Arithmetic) işlemlerde olusan Run Time Exception type'dir.
        Scanner scan=new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("2.sayiyi giriniz");
        int sayi2= scan.nextInt();
//        int bolum=sayi1/sayi2;
//        System.out.println("bolum = " + bolum);//RTE->ArithmeticException
        try {//dene->hatanin(exception) olma ihtimali olan action blok ->benzin depo kontrolu
            System.out.println("try blok run edildi");
            System.out.println(sayi1/sayi2);//emin olunmayan denenmesi gereken action komut
            System.out.println("try bloktan selamlar");
            /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz.catch block try block exception yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
               aynı anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
            3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE
             */
        //} catch (Exception e) {//parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE
        } catch (ArithmeticException e) {//yakala->try blok'ta denenen istisnai durum gerceklesirse yapilmasi gereken handlin->action
            System.out.println("1.catch blok run edildi");
            System.out.println("Hic bolen sayi sifir olur mu "+e.getMessage());//exc. mesaji print edildi
            e.printStackTrace();//exc. tum ciktiyi print eder
            System.out.println("1.catch bloktan selamlar");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("2.catch blok run edildi");
            System.out.println("2.catch bloktan selamlar");
        }catch (Exception ebikGabik){//Exception->tum exc. turlerin parent classi:Hz Adem
            //Exception->olusan istisnai durum data type
            //ebikGabik->java'nin olusan exc. atanacak obj name
            System.out.println("Hz. Adem catch blok run edildi");
            System.out.println("Hz. Adem catch bloktan selamlar");
        }finally {//ne yaparsan yap sonunda bunu yap->catch bloklardan sonra mutlaka calismasi istenen actionlar icin tanimlanir
            // ->en son arabanin kontagini kapat
            System.out.println("Finaly bloktan selamlar");
            /*
            try - catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally  blok tanımlanır.
            hata alınır ama finaly tanımlanırsa catch çalışmasa bile
            pr akışı devam eder.finally block hata olsa da olmasa da calışır.
            Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
            başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
             */
        }

        System.out.println("Eger bu mesaji okuduysan app sorunsuz calisiyor");

    }
}
