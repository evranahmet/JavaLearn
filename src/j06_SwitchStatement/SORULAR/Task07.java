package j06_SwitchStatement.SORULAR;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> Girilen 3 basamaklı bir sayıyı harf karakteri ile print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir sayı giriniz");
        int sayı = sc.nextInt();

        if (sayı >= 100 && sayı < 1000) {
            int yüzler = sayı / 100;
            int onlar = (sayı / 10) % 10;
            int birler = sayı%10;

            switch (yüzler) {
                case 1:
                    System.out.println("yüz");
                    break;
                case 2:
                    System.out.println("ikiyüz");
                    break;
                case 3:
                    System.out.println("üçyüz");
                    break;
                case 4:
                    System.out.println("dörtyüz");
                    break;
                case 5:
                    System.out.println("beşyüz");
                    break;
                case 6:
                    System.out.println("altıyüz");
                    break;
                case 7:
                    System.out.println("yediyüz");
                    break;
                case 8:
                    System.out.println("sekizyüz");
                    break;
                case 9:
                    System.out.println("dokuzyüz");
                    break;
                default:
                    System.out.println("");
            }
            switch (onlar) {
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("yirmi");
                    break;
                case 3:
                    System.out.println("otuz");
                    break;
                case 4:
                    System.out.println("kırk");
                    break;
                case 5:
                    System.out.println("elli");
                    break;
                case 6:
                    System.out.println("altmış");
                    break;
                case 7:
                    System.out.println("yetmiş");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;
                default:
                    System.out.println("");
            }
            switch (birler) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("beş");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;
                default:
                    System.out.println("");

            }

        } else {
            System.out.println("Lütfen doğru sayı giriniz");
        }

    }
}


