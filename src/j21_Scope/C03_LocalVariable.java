package j21_Scope;

public class C03_LocalVariable {
    public static void main(String[] args) {
        int yas=33;//main localde create edilen primitive variable
        System.out.println("yas = " + yas);//local variable ayni scope'ta dogrudan call edilir
        for (int i = 1; i <=9; i++) {//loop level
            System.out.println(yas+" "+i);//main scope variable ayni scope'taki loop scope dogrudan call edilebilir
            i+=3;
        }//loop sonu
        //i+=7;//i loop variable old. icin scope disina cagirilamaz->CTE
        yas=49;//main scope variable call edilerek atama yapildi
    }//main sonu
    //yas=50//main scope variable scope disina call edilemez->CTE
    //trick->her variable kendi coplugunde doagar buyur ve olur(scope disina cikamaz)
}
