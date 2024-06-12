package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLopp {
    public static void main(String[] args) {
        /*
      Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
      net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
       */

        //Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.

        System.out.println("*****For ile*****");
        for (int i = 3; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("*****While ile*****");
        int i = 3;//While loop'un baslangıc degeri tanımlandı.
        while (i <= 20) {// i 20'den kücük oldugu sürece loop devam edecek.
            System.out.print(i + " ");
            i++;//While lopp sartı icin değisim komutu tanımladı.
        }

        // task02-> 7 kere javaCAN print eden code create edinizi

        int x = 0;
        while (x < 7) {
            System.out.println("javaCAN");
            x++;
        }

        int tekrar = 7;
        while (tekrar >= 1) {
            System.out.println("javaCAN");
            tekrar--;
        }

        // task03->2 basamaklı tek sayıları print eden code create ediniz

        int y = 11;
        while (y < 100) {
            System.out.print(y + " ");
            y += 2;
        }

        // task04->girilen ifadeyi tersten  print eden code create ediniz
        System.out.println("*****task04*****");
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String str = sc.nextLine();
        int harfsayisi = str.length();
        while (harfsayisi > 0) {
            System.out.print(str.charAt(harfsayisi - 1));
            harfsayisi--;
        }

        // task06->girilen pozitif  tamsayıya kadar sayıların toplamını  print eden code create ediniz

        System.out.println("*****task5*****");
        System.out.println("pozitif bir tamsayı giriniz");
        int sayı = sc.nextInt();
        int toplam = 0;

        while (sayı >= 0) {
            toplam += sayı;
            sayı--;
        }
        System.out.print("toplam :" + toplam);

        // task07->girilen tamsayının faktöriyelini  print eden code create ediniz

        System.out.println("*****task 7*****");
        System.out.println("bir sayı giriniz");
        int sayı2= sc.nextInt();
        int faktor = 1;
        while (sayı2 > 1) {
            faktor*=sayı2;
            sayı2--;
        }
        System.out.print("faktor :" + faktor);



        }
    }









