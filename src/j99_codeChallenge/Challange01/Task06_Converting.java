package j99_codeChallenge.Challange01;

import java.util.Scanner;

public class Task06_Converting {
    public static void main(String[] args) {//main scope
        /*  task->
         girilen sıcaklık değerini Fahrenhayt'tan Santigrat derecesine çeviren code create ediniz.
         formül
         c = (f-32)*5/9
     */
        Scanner input = new Scanner(System.in);
        System.out.print("Agam hele ıscaklığı giresen : ");
        double sıcaklık = input.nextDouble();

        System.out.println("agam sıcaklık derecesi : "+(sıcaklık - 32) * 5 / 9);//


    }//main sonu
}//Class sonu
