package j25_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {//outer try blok->file erisim exc
            FileInputStream fis = new FileInputStream("src/j25_Exceptions/ebikGabik");
            int k;//erisilen file her char ascii degerinin atanacagi bos kutu
            try {//inner try blok->erisilen file'daki data okunamadi
                while ((k = fis.read()) != -1){
                    System.out.print((char) k);//k int ascii olan file degeri char icin casting yapildi->type donusumu
                }
                System.out.println();
                System.out.println("bu ciktiyi okuyorsan inner try blok sorunsuz run edildi");
            } catch (IOException e) {//inner catch blok->file eisiliyor fakat dosya okunamiyorsa bu catch blok calisir
                System.out.println("Istedigin file ulasildi fakat dosya okunamadi");
                System.out.println("Inner catch blok run edildi");
            }
            System.out.println("bu ciktiyi okuyorsan outer try blok sorunsuz run edildi");
        } catch (FileNotFoundException e) {//outer catch blok->file erimezse bu catch blok calisacak
            System.out.println("EbikGabik dosyasina erisilemiyor");
            System.out.println("Eger bu mesaji okuyorsan try exc. yakaladi");
            //throw new RuntimeException(e);
        }
        System.out.println("Eger bu mesaji okuyorsan app sorunsuz calisti");
    }
}
