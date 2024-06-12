package j99_codeChallenge.Challange02;

public class Task01_Modulus {//Class level-scope

    public static void main(String[] args) {//main scope
        // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru print eden code create ediniz.
        // Hint: use / and %
        //    input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //

        int sayi = 12345;
        int birler=sayi%10;// 5 -> sayının 10 a bol kalan
        int onlar=(sayi/10)%10;//12345/10=1234 ->1234%10=4
        int yuzler=(sayi/100)%10;// 12345/100=123 ->123%10=3
        int binler=(sayi/1000)%10;// 12345/1000=12 ->12%10=2
        int onBinler=sayi/10000;//12345/10000=1
        System.out.println("birler :"+birler+"\nonlar : "+onlar+"\nyuzler : "+yuzler+"\nbinler : "+binler+"\nonbinler : "+onBinler);

    }//main sonu

}//Class sonu
