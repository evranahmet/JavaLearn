package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        //task-> bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //             24.5673 ==>    5+6+7+3 = 21

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ondalikli sayi giriniz");
        String ondalik= scan.next();
        int sayi;
        if (ondalik.contains(".")){
            sayi=Integer.parseInt(ondalik.substring(ondalik.indexOf(".")+1));
        }else {
            sayi=Integer.parseInt(ondalik);
        }
        int toplam=0;
        do{
            toplam+=sayi%10;
            sayi/=10;
        }while (sayi!=0);
        System.out.println("toplam = " + toplam);


    }
}
