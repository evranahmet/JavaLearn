package j08_Loops.Loop01_FoorLoop.Tasks;

public class Task11_rakamı_chara_degistirme {
    public static void main(String[] args) {

        /*
        A               //1. satıra 1 harf
        A B             //2. satıra 2 harf
        A B C           //3. satıra 3 harf
        A B C D
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */
        int harf=65;
        for (int kat = 0; kat < 6; kat++) {
            for (int daire = 0; daire <=kat; daire++) {
                System.out.print((char)(harf+daire)+" ");//harfi ascii ye cevirmek icin başına char ekleriz.
            }
            System.out.println();
        }




    }
}
