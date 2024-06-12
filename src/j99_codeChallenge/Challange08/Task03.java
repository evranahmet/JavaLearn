package j99_codeChallenge.Challange08;


import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
        /* task->
         *(String iniz: "HeySiri"  arrayi "ByeSiri" ye ceviren code create ediniz )
         */

        String str = "HeySiri";
        System.out.println("str = " + str);// "HeySiri"
        // 1. yol-> cincix code
        System.out.println("   ***   cincix code   ***   ");
        System.out.println(str.replace("Hey", "Bye"));//ByeSiri

        // 2. yol-> amele code
        System.out.println("   ***   amele code   ***   ");

        String strArr[]=str.split("y");
        System.out.println(Arrays.toString(strArr));// ["He", "siri"]
        strArr[0]="Bye";//He->Bye
        System.out.println(strArr[0] + strArr[1]);//ByeSiri


    }// main sonu


}// Class sonu