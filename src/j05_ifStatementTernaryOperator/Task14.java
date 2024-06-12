package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cnsyt= scan.next();
        if (cnsyt.equalsIgnoreCase("Kadin")){
            System.out.println("yasinizi giriniz");
            int yas= scan.nextInt();
            if (yas>=60){
                System.out.println("Prim gununuzu giriniz");
                int primGunu=scan.nextInt();
                if (primGunu>=6000){
                    System.out.println("Tebrikler emekli olabilirsiniz");
                }else {
                    System.out.println("Emekli olmanız için "+(6000-primGunu)+" prim gününe ihtiyacınız var");
                }
            }else {
                System.out.println("Hanımefendi emekli olmanıza "+ (60-yas)+" yıl var");

            }
        } else if (cnsyt.equalsIgnoreCase("erkek")) {
            System.out.println("yasinizi giriniz");
            int yas= scan.nextInt();
            if (yas>=65){
                System.out.println("Prim gununuzu giriniz");
                int primGunu=scan.nextInt();
                if (primGunu>=7000){
                    System.out.println("Tebrikler emekli olabilirsiniz");
                }else {
                    System.out.println("Emekli olmanız için "+(7000-primGunu)+" prim gününe ihtiyacınız var");
                }
            }else {
                System.out.println("Beyefendi emekli olmanıza "+ (65-yas)+" yıl var");

            }

        }else System.out.println("Hatali giris yaptin");




    }
}
