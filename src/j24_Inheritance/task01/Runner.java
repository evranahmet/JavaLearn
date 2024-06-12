package j24_Inheritance.task01;

public class Runner {//5. step
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a.ricetteDolceFacili = " + a.ricetteDolceFacili);// ahanda jülide
        System.out.println("A.ricetteDolceFacili = " + A.ricetteDolceFacili);// ahanda jülide

        B b=new B();
        System.out.println("b.ricetteDolceFacili = " + b.ricetteDolceFacili);// Güllaç
        System.out.println("B.ricetteDolceFacili = " + B.ricetteDolceFacili);// Güllaç
        System.out.println("A.ricetteDolceFacili = " + A.ricetteDolceFacili);
    }



}
