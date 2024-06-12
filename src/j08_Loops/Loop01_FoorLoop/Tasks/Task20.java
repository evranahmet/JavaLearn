package j08_Loops.Loop01_FoorLoop.Tasks;

public class Task20 {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.

        int satir = 5;
        int sayi = 1;

        for (int i = 1; i <= satir; i++) {
            sayi = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(sayi + " ");
                sayi += (satir - j);
            }
            System.out.println();
        }

    }
}
