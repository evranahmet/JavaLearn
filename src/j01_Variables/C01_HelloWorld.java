package j01_Variables;

public class C01_HelloWorld {
    //java yorum satırlarını -> comment line compile (derleme) etmez
    // -> tek satır yorum için

    /*
    coklu satır : multiple comment line
    bu araya ne yazarsam yazayım java compile etmez
    trick -> madem geldin dünyaya
    otur çalış javaya
     */

    public static void main(String[] args) {
        //imlecin (cursor) olduğu satır CTRL+D alt satıra çoğaltır.
        //imlecin (cursor) olduğu satır CTRL+D geri alır.
        /*
        java run edildiğinde çalışmaya ilk olarak main method'dan başlar
        daha sonra yukarıdan aşağı ve soldan sağa doğru sırasıyla işlem yapar.
         */

        System.out.println("Hello World :)");//consola output->cikti veren metodu calıstırdım
        System.out.print("Hello World :) ");
        System.out.println("javacanlara selam olsun");
        System.out.println("ahmet");

        /*
        print() : yazdırma işleminden sonra komut aynı satırdan devam ettirir.
        println() : yazdırma işleminden sonra komut alt satırdan devam eder.
        java'da space bir karakter olarak tanımlanır.


         */
    }
}
