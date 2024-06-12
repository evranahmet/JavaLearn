package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task01_NestedIfStatement {
    /* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int age = input.nextInt();
        if (age>=18){
            System.out.println("oy kullanmaya uygun");
            if (age<50 && age>=18){
                System.out.println("bir kez oy kullanabilir");
            } else if (age<70 && age>=50) {
                System.out.println("iki kez oy kullanabilir");

            } else if (age>=70) {
                System.out.println("üç kez oy kullanabilir");
            }
        } else {
            System.out.println("oy kullanmaya uygun değii");
            
        }

    }// main sonu

    }