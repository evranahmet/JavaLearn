package j06_SwitchStatement.SORULAR;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir ay giriniz");
        int ay=sc.nextInt();
        switch(ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girilen ay 31 gündür");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girilen ay 30 gündür");
                break;
            case 2:
                System.out.println("hangi yıl olduğunu giriniz");
                int yıl=sc.nextInt();
                if (yıl%4==0) {
                    if (yıl % 100 != 0 || yıl % 100 == 0) {
                        System.out.println("Girilen ay 29 gündür");
                    } else {
                        System.out.println("Girilen ay 28 gündür");
                    }
                    break;


                }
            default:
                System.out.println("hatalı giriş yaptınız");
        }


    }
}
