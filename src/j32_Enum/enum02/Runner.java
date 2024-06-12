package j32_Enum.enum02;

public class Runner {
    public static void main(String[] args) {
        User kl1=new User();
        kl1.name="Enes Bey";
//        kl1.role=0;
//        kl1.status=2;
        kl1.role=Role.ADMIN;
        kl1.status=Status.ACTIVE;

        User kl2=new User();
        kl2.name="Yucel Bey";
//        kl2.role=0;
//        kl2.status=2;
        kl2.role=Role.CUSTOMER;
        kl2.status=Status.INACTIVE;

        if (kl2.role == Role.ADMIN){
            System.out.println(kl2.name+" mühür sende yetki sende istediğini sil");
        }else System.out.println(kl2.name+" senin böyle bir silme yetkin yok");
        if (kl1.role == Role.ADMIN){
            System.out.println(kl1.name+" mühür sende yetki sende istediğini sil");
        }else System.out.println(kl1.name+" senin böyle bir silme yetkin yok");

    }
}
