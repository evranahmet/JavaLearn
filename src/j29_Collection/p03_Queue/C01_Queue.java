package j29_Collection.p03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
    Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
    ile obj uretilir.
    Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
    Const seçimine göre queue obj özellikleri belirlenir.
    FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenir enbaştan silinir.
    */

        Queue<String> q1 = new LinkedList<>(Arrays.asList("javaCAN", "javİDAN", "jaVİYE", "javaSU", "javaHAN", "javaZADE"));
        //queue print
        System.out.println("q1 = " + q1);//[javaCAN, javİDAN, jaVİYE, javaSU, javaHAN, javaZADE]
        //queue add()-->eleman ekleme
        q1.add("JavaDENIZ");
        System.out.println("q1 = " + q1);//[javaCAN, javİDAN, jaVİYE, javaSU, javaHAN, javaZADE, JavaDENIZ]

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("Busura", "jaBAN", "javaZAN", "javaCEP"));
        System.out.println("q2 = " + q2);//[Busura, jaBAN, javaZAN, javaCEP]
        q2.add("javaHIR");
        System.out.println("q2 add() sonrası = " + q2);//[Busura, jaBAN, javaZAN, javaCEP, javaHIR]
        System.out.println("q2.peek() = " + q2.peek());//Busura-->ilk elemanı alır (peek)
        System.out.println("q2.element() = " + q2.element());//Busura-->ilk elemanı alır (peek)
        System.out.println("q2.size() clear() öncesi = " + q2.size());//5
        System.out.println("q2.isEmpty() clear() öncesi = " + q2.isEmpty());//false
        q2.clear();
        System.out.println("q2.size() clear() sonrası = " + q2.size());//0
        System.out.println("q2.isEmpty() clear() sonrası = " + q2.isEmpty());//true
        System.out.println("q2.peek() = " + q2.peek());//null
        //System.out.println("q2.element() = " + q2.element());//RTE-->NoSuchElementException


        System.out.println("q2.peek() = " + q2.peek());//null
        //System.out.println("q2.remove() = " + q2.remove());//RTE-->NoSuchElementException
//        q2.add("javaT");
//        q2.add("javaLAN");
        System.out.println("q2 = " + q2);//[javaLAN, javaT]
        q2.offer("Falan");

        // ahan da Trick kösesinde bugun : offer()-> queue coll. eleman eklemek için kullanılır.
        // queue'de eleman kısıtlaması varsa add() meth. rte fırlatırken offer() true-false return eder.
        System.out.println("q2 offer() sonrası = " + q2);//[Falan]




    }
}
