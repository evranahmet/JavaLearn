package j08_Loops.Loop02_WhileLoop;

public class C04_WhileLoop {

    public static void main(String[] args) {

        //task-> 3 basamaklı 4 ile tam bölünen sayıları print eden code create ediniz
        for (int i=100;  i<1000;  i+=4){
            System.out.print(i+" ");
        }
        System.out.println("*****While ile*****");
        int bas=100;
        while (bas<1000){
            if (bas%4==0) System.out.print(bas+" ");//4 e tam bölünen sayılar yazdırıldı
            bas++;//100 ile 999 arası loop degisimi saglandı
        }
        
    }
}
