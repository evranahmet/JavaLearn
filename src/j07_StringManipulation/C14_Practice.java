package j07_StringManipulation;

import java.util.Scanner;

public class C14_Practice {
    public static void main(String[] args) {

        /*
Task->  girilen bir password için aşagıdaki şartları sağlarsa "gayet başarılı DEWAMKEEE :)"
sağlamazsa "Çok başarısız :( agam yeni paaword giresen" print eden code create ediniz.
1-en az 8 karakter uzunlugunda,
2-ilk harf buyuk,
3-son harf kucuk,
4-boşluk içermemeli
 */

        Scanner scan=new Scanner(System.in);;
        System.out.println("passwordunuzu giriniz");
        String password=scan.nextLine();
        if(password.length()>=8//passwordun uzunluğu sartı kontol edildi
                &&Character.isUpperCase(password.charAt(0))//İlk harf büyük harf mi kontrolü yapıldı
                &&Character.isLowerCase(password.charAt(password.length()-1))//Son harf küçük harf mi kontrolü yapıldı
                &&!password.contains(" ") ){//boşluk içermeme kontrolü yapıldı
        System.out.println("gayet başarılı DEWAMKEEE :)");



        }else System.out.println("Çok başarısız :( agam yeni pasword giresen");
    }
}
