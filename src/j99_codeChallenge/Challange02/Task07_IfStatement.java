package j99_codeChallenge.Challange02;

import java.util.Scanner;

public class Task07_IfStatement {
    public static void main(String[] args) {

     /*

		task->
		Kullanicinın  yas ve kilo bilgileri için
		18 yasindan kucuk ise kan bagisi yapamaz.
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		print eden code create ediniz.

		 */
        Scanner input = new Scanner(System.in);
        System.out.println("Agıdeşşş yasını girive bakennn : ");
        int yas = input.nextInt();


        if (yas >= 18) {//genel sart-> yas kontrolu
            System.out.println("Agıdeşşş kilonu girive bakennn : ");
            int kilo = input.nextInt();
            if (kilo >= 50) {//özel sart-> kilo kontrolu

                System.out.println("kan bağısı yapabilir siniz");
            } else System.out.println("kan bagısı için yasınız uygun ama kilonuz eksik");

        } else System.out.println("kan bagısı için yasınız uygun değil");

    }// main sonu


}

