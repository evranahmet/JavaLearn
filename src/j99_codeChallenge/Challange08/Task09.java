package j99_codeChallenge.Challange08;

public class Task09 {

    public static void main(String[] args) {
        /* Task->
         * Girilen Multidimensional arraydeki cift sayilarin toplamını print eden method
         * create ediniz.
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */


        int arr[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        ciftToplaPli(arr);//30
    }// main sonu

    private static void ciftToplaPli(int[][] arr) {

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    toplam += arr[i][j];
                }

            }

        }
        System.out.println(toplam);
    }


}// Class sonu