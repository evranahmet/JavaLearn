package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task06 {
    /*  Tsk->
   girilen  Stringin ilk iki karakteri haric string return eden code create ediniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem
*/
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime= scan.next();

        if (kelime.startsWith("gh")){
            System.out.println(kelime);
        } else if (kelime.startsWith("g")){
            System.out.println(kelime.charAt(0) + kelime.substring(2));{

            }
        } else if (kelime.charAt(1)=='h') {
            System.out.println(kelime.substring(1));


        }else {
            System.out.println(kelime.substring(2));
        }

    }
}