package j09_Break_Continue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
         /*
    break loop'u istenen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
    kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
    herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
    loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
    satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
    içinde kullanıldığı loop'dan çıkışı sağlar:
    temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
    */

        //Task-> girilen bir mail hesabı @ karakterine kadar olan karakterleri print eden code create ediniz...
        // ebikgabık@cimeyıl.com

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir mail hesabı giriniz");
        String mail=scan.next();
        System.out.println("***1.yol***");
//        int i=0;
//        while (i<mail.length()){
//            if (mail.charAt(i)=='@'){
//                break;
//            }
//            System.out.print(mail.charAt(i));
//            i++;
//        }
        System.out.println("***2.yol***");
        for (int i = 0; i < mail.length(); i++) {//emailin 0. indexten sonuna kadar dongu calisiyor
            if (mail.charAt(i)=='@'){//tekrardan gelen herbir index icin charin '@' esit olmasi durumuna bakiliyor
                break;//if true oldugunda dongu bitiyor veya kiriliyor
            }
            System.out.print(mail.charAt(i));//if false oldugun sout calisiyor
        }




    }
}
