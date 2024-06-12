package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task05 {
    public static void main(String[] args) {
          /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        şekli print eden code create ediniz
         */
        for (int kat = 1; kat <=6 ; kat++) {
            for (int daire = 1; daire <=5 ; daire++) {
                System.out.print("# ");
            }
            System.out.println();//bos dummy->kodu etkilemez printin alt satira gecmesini sagliyor
        }


    }
}
