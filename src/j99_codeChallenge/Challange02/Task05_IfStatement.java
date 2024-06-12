package j99_codeChallenge.Challange02;

import java.util.Scanner;

public class Task05_IfStatement {
    public static void main(String[] args) {
         /* Task->
    Girilen jobTitle data için : Eger jobTitle
    qa ise print "is unvaniniz Quality Analyst."
    dev ise print "is unvaniniz Developer."
    ba ise print "is unvaniniz Business Analyst."
    pm ise print "is unvaniniz Project Manager."
    print eden code create ediniz...
   */
        Scanner input = new Scanner(System.in);
        System.out.println("Agıdeşşş job title girive bakennn : ");
        String jobTitle = input.next();
        if (jobTitle.equalsIgnoreCase("qa")) {
            System.out.println("is unvaniniz Quality Analyst.");
        } else if (jobTitle.equalsIgnoreCase("dev")) {
            System.out.println("is unvaniniz Developer.");
        } else if (jobTitle.equalsIgnoreCase("ba")) {
            System.out.println("is unvaniniz Business Analyst.");

        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("is unvaniniz Project Manager.");

        } else System.out.println("adıdeşş adam gibi bişey gir bakenn");

    }// main sonu


}

