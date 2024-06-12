package j05_ifStatementTernaryOperator.SORULAR;

import java.util.Scanner;

public class Task17xxxxxtas_kagıt_makas {
    public static void main(String[] args) {
        /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("taş kağıt makas oyununa hoşgeldiniz: ");
        System.out.println("oyunda seçebileceğiniz tuşlar: \nTaş: T-t \nMakas: M-m \nKağıt: K-k");
        Character ch = scan.next().charAt(0);

        System.out.println(Character.toUpperCase(ch));

        char tass = 't';
        char kagitt = 'k';
        char makass = 'm';

        char data[] = {'t', 'm', 'k'};
        String str = new String(data);

        int rastgeleSayi = (int) (Math.random() * 3);

        System.out.println(rastgeleSayi);
        System.out.println(data[rastgeleSayi]);

        if (ch == 't') {
            if ((data[rastgeleSayi]) == 't') {
                System.out.println("You: " + ch);
                System.out.println("PC : " + data[rastgeleSayi]);
                System.out.println("Draw");
            }
            if ((data[rastgeleSayi]) == 'm') {
                System.out.println("You: " + ch);
                System.out.println("PC : " + data[rastgeleSayi]);
                System.out.println("You Win");
            }
            if ((data[rastgeleSayi]) == 'k') {
                System.out.println("You: " + ch);
                System.out.println("PC : " + data[rastgeleSayi]);
                System.out.println("You lost");
            }
        }

        if (ch == 'k') {
            if ((data[rastgeleSayi]) == 't') {
                System.out.println("You: " + ch);
                System.out.println("PC : " + data[rastgeleSayi]);
                System.out.println("You Win");
            }
            if ((data[rastgeleSayi]) == 'm') {
                System.out.println("You: " + ch);
                System.out.println("PC : " + data[rastgeleSayi]);
                System.out.println("You Lost");
            }
            if ((data[rastgeleSayi]) == 'k') {
                System.out.println("You: " + ch);
                System.out.println("PC : " + data[rastgeleSayi]);
                System.out.println("Draw");
            }
        }

        if (ch == 'm') {
            if ((data[rastgeleSayi]) == 't') {
                System.out.println("You: " + ch);
                System.out.println("PC : " + data[rastgeleSayi]);
                System.out.println("You Win");
            }
            if ((data[rastgeleSayi]) == 'm') {
                System.out.println("You: " + ch);
                System.out.println("PC : " + data[rastgeleSayi]);
                System.out.println("Draw");
            }
            if ((data[rastgeleSayi]) == 'k') {
                System.out.println("You: " + ch);
                System.out.println("PC : " + data[rastgeleSayi]);
                System.out.println("You Lost");
            }
        }
    }
}