package j07_StringManipulation.SORULAR;

        import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Girilen isim giriniz");
        String isim=scan.nextLine();

        if (isim.length()==3){

            String ilkHarf=isim.substring(0,1);
            String ikinciHarf=isim.substring(1,2);
            String üçüncüHarf=isim.substring(2,3);

            if ((!ilkHarf.equals(ikinciHarf)) && !(ilkHarf.equals(ikinciHarf)) && !(ikinciHarf.equals(üçüncüHarf))){
                System.out.println("Girdiğiniz isim unique karakterlerine sahip");


            }else{
                System.out.println("Girdiğiniz isim unique karakterlerine sahip değil");
            }






        }else {
            System.out.println("Lütfen 3 harfli bir isim giriniz");
        }



    }
}