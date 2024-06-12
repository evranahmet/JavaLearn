package j101_interviewQuestions;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String pin = "javvaNURjavaNAZjavaSU";
        int girisHakki=3;
        while (true){
            System.out.println("Lutfen pin kodunuzu giriniz");
            String kulPin=input.nextLine();
            if (kulPin.equals(pin)){
                System.out.println("Nasilsin Hosgeldin");
                break;
            }else {
                System.out.println("Hatali giris");
                girisHakki--;
                System.out.println("Kalan giris hakkin : "+girisHakki);
            }
            if (girisHakki==0){
                System.out.println("Bir telefoncu bul pin kodun bloke oldu");
                break;
            }
        }

    }
}
