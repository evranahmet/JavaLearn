package j99_codeChallenge.Challange01;

public class Task05_Avarage {//Class scope

    public static void main(String[] args) {//main level
                /* task->
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        bu double sayilarin ortalamasini print eden code create ediniz.

     */
        double num1 = 23.4,
                num2 = 24.0,
                num3 = 12,
                num4 = 450.3,
                num5 = 23000;

        double toplam=num1 + num2 + num3 + num4 + num5;
        double ortalama=toplam/5;
        System.out.println("girlen sayıların ortalaması : "+(toplam)/5);// 4701.9400000000005
        System.out.println("girlen sayıların ortalaması : "+(num1 + num2 + num3 + num4 + num5)/5);// 4701.9400000000005
        System.out.println("girlen sayıların ortalaması : "+ortalama);// 4701.9400000000005


    }//main sonu
}//Class sonu
