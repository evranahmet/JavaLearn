package j08_Loops.Loop01_FoorLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        // Task-> girlen sayıdan 100'e kadar 4'un katı olan tamsayıları yan yana print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();
        if (sayi<100&&sayi>0){
            for (int i = sayi; i < 100; i++) {
                if (i % 4 == 0) {
                    System.out.print(i + " ");
                }
            }

        }else System.out.println("Bu sayı kabul edilmedi");

            }
        }

