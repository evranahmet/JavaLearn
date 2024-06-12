package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task19 {

    /*
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
    */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Doğum yılını giriniz");
        int yil= scan.nextInt();
        if (yil%12==0){
            System.out.println("Maymun");
        } else if (yil%12==1) {
            System.out.println("Horoz");
        }else if (yil%12==2) {
            System.out.println("Köpek");
        }else if (yil%12==3) {
            System.out.println("Domuz");
        }else if (yil%12==4) {
            System.out.println("Fare");
        }else if (yil%12==5) {
            System.out.println("Öküz");
        }else if (yil%12==6) {
            System.out.println("Kaplan");
        }else if (yil%12==7) {
            System.out.println("Tavşan");
        }else if (yil%12==8) {
            System.out.println("Ejderha");
        }else if (yil%12==9) {
            System.out.println("Yılan");
        }else if (yil%12==10) {
            System.out.println("At");
        }else if (yil%12==11) {
            System.out.println("Koyun");
        }


    }
}
