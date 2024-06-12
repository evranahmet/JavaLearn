package j99_codeChallenge.Challenge08_Cevaplar;

public class Task08 {
    public static void main(String[] args) {
        /* task->
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini print eden code create ediniz.
         */

        String strArr[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        double toplam = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                if (strArr[i][j].contains("$")) {
                    toplam += Double.parseDouble(strArr[i][j].replace("$", ""));
                } else toplam += Double.parseDouble(strArr[i][j].replace("€", ""));

            }
        }
        System.out.println("toplam = " + toplam);//98.0

    }// main sonu


}// Class sonu