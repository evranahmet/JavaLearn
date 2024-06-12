package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen cinsiyet giriniz : ");
        String cinsiyet=sc.next();

        if (cinsiyet.equalsIgnoreCase("erkek") ){
            System.out.println("Lütfen yaşınızı giriniz");
            int yaş=sc.nextInt();
            if (yaş<18) {
                System.out.println("Erkek çocuk");
            } else if (yaş>18){
                System.out.println("Adam");
            }
        }if (cinsiyet.equalsIgnoreCase("kadın")){
            System.out.println("Lütfen yaşınızı giriniz");
            int yaş=sc.nextInt();
            if (yaş<18) {
                System.out.println("Kız çocuk");
            } else {
                System.out.println("Kadın");
            }
        }


        }


    }
































