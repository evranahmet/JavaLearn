package j27_Interface.Tasks.Task06;

public class Palov implements IFood {
    @Override
    public void taste() {
        System.out.println("safranlı tane tane..");
    }

    @Override
    public double ucret() {
        return 4.0;
    }

    public void fry() {
        System.out.println("pirinçler tereyağında kavruldu...");
    }

    public void boil() {
        System.out.println("kısık ateşte pişirildi..");
    }
}
