package j07_StringManipulation.tasks;

public class Task10 {


    // Task-> "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde print eden code create ediniz.

    public static void main(String[] args) {

        String str="   Java ogrenmek123 Cok guzel@      ";
        System.out.println(str.trim().replaceAll("\\d", "").replaceAll("C", "c").replaceAll("@", ""));


    }

}
