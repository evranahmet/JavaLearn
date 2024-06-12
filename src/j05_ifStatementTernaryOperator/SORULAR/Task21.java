package j05_ifStatementTernaryOperator.SORULAR;

public class Task21 {

    public static void main(String[] args) {
        /* Task->
        a) Son basamak 5 ‘e esit ve 5 den buyukse, yuvarlama islemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den kucukse, yuvarlama islemi: “Son basamagi bir alt ondaliga yuvarla”
         */

        int sayi = 1456;
        /*
        1453 -> 1450
        1456 -> 1460
         */

        if (sayi % 10 >= 5) {

            int birler = sayi % 10; // 3

            System.out.println("Sayi : " + (sayi + (10 - birler))); // (1456+(10-6)) -> 1460

        } else {
            int birler = sayi % 10; // 3
            System.out.println("Sayi : " + (sayi - birler)); // 1450
        }


    }

}



