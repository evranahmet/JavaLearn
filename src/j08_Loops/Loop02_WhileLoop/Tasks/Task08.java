package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreTekrar = true;

        while (sifreTekrar) {
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scan.nextLine();
            boolean flag = true;
            //ilk karakter kucuk olmali kontrolu
            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')){
                System.out.println("Ilk karakter kucuk harf olmali");
                flag=false;
            }

            //son karakter rakam olmali kontrolu
            //if ((sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9'))
            if (!(Character.isDigit(sifre.charAt(sifre.length()-1)))){
                System.out.println("Son karakter rakam olmali");
                flag=false;
            }

            //sifrede bosluk kontrolu
            if (sifre.contains(" ")){
                System.out.println("Sifrede bosluk olmamali");
                flag=false;
            }

            //sifre uzunluk kontrolu
            if (!(sifre.length()>=10)){
                System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
                flag=false;
            }
            //1.yol
            if (flag) {
                System.out.println("sifre basariyla kaydedildi");
                sifreTekrar = false;
            }

            //2.yol
//            if (sifreKontrol(sifre)) {
//                System.out.println("sifre basariyla kaydedildi");
//                sifreTekrar = false;
//            }
        }
    }

//    private static boolean sifreKontrol(String sifre) {
//        int flag = 0;
//        //ilk karakter kucuk olmali kontrolu
//        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')){
//            System.out.println("Ilk karakter kucuk harf olmali");
//            flag++;
//        }
//
//        //son karakter rakam olmali kontrolu
//        //if ((sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9'))
//        if (!(Character.isDigit(sifre.charAt(sifre.length()-1)))){
//            System.out.println("Son karakter rakam olmali");
//            flag++;
//        }
//
//        //sifrede bosluk kontrolu
//        if (sifre.contains(" ")){
//            System.out.println("Sifrede bosluk olmamali");
//            flag++;
//        }
//
//        //sifre uzunluk kontrolu
//        if (!(sifre.length()>=10)){
//            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
//            flag++;
//        }
//
//        return flag==0;
//    }
}
