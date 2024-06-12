package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou


        Scanner sc = new Scanner(System.in);
        System.out.print("Cumle : ");
        String str = sc.nextLine();

        tekrarsiz(str);


    }//main sonu

    public static void tekrarsiz(String str) {

        String tekrarsizStr = "";

        for (int i = 0; i < str.length(); i++) {

            if (!(tekrarsizStr.contains(str.substring(i, i + 1)))) {

                tekrarsizStr += str.substring(i, i + 1);
            }
        }

        System.out.println("tekrarsizStr = " + tekrarsizStr);

    }


}
