package j08_Loops.Loop01_FoorLoop;

public class C01_FoorLoop {
    public static void main(String[] args) {
        //forloop-->tekrarlayan sabit actionlar icin tanimlanan code blogudur.

         //başlangıç-start value      bitiş-end value      value değişim
        for (int i = 0;                i < 41;              i++) {//her tekrarda alınacak aksiyon
            System.out.println(i+1+".Maaşallah");
        }

        // task02-> 2 basamalı tek sayıları aynı satıra aralarında boşluk ile print eden code create ediniz.

        for (int i = 11;  i < 100;   i+=2) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("****2. yol********");


        for (int i = 0; i < 100; i++) {
            if (i>=10 && i%2 !=0){//---> !=0  yerine ==1 de kullanılabilir.
                System.out.print(i+ " ");
            }
        }
         /*
            Code standarts
          1) Tekrar (Repetition) olmamalidir
          2) Dynamic olmalidir
          3) Tamir (Fix) ve update kolay yapilabilmelidir
           */


    }
}
