package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin=scan.nextLine();
        System.out.println("metindeki öğrenmek istediğin harfi gir");
        char harf=scan.next().charAt(0);
        int count=0;
        for (int i = 0; i <metin.length() ; i++) {
            if (metin.charAt(i)==harf) {
                count++;
            }

        }
        System.out.println(harf+" sayısı :"+count);

    }
}
