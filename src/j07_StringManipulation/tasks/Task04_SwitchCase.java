package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task04_SwitchCase {
    /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	switch() de int, byte, short, char, String kullanilir.
     */
 /*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Haftanın bir gününü giriniz");
        String gun=scan.next();
        switch (gun){
            case "pazartesi" :
            case "salı":
                System.out.println("Java dersi gunleri");
                break;
            case "çarşamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
            case "perşembe:":
            case "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            default:
                System.out.println("izin günü");

        }

    }// main sonu

}