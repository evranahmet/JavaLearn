package j06_SwitchStatement.SORULAR;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz

            Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen harf giriniz");
        char ch =sc.next().charAt(0);

        switch (ch){
            case 'v' : System.out.println("very"); break;
            case 'i' : System.out.println("important"); break;
            case 'p' : System.out.println("person"); break;
            default:
                System.out.println("lütfen geçerli bir harf giriniz");
        }


    }
}
