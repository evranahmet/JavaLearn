package j10_MethodCreation.Tasks;

public class Task19 {

    public static void main(String[] args) {
        /*
   task->
   INTERVIEW SORUSU !!!
   1'den 100'e kadar hic rakam  kullanmadan sayilari print eden METHOD create ediniz

    */

        saydir();

    }

    private static void saydir() {

        int count = 'a' / 'a'; // 97/97 = 1

        while (count <= 'd') {

            System.out.print(count + " ");
            count++;
        }
    }


}
