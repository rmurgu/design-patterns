package creational.prototype;

public class AppPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();

        Swordsman s2 = (Swordsman) s1.clone();

        s2.position.setX(100);
        s2.position.setY(200);

        s1.position.setX(10);
        s1.position.setY(20);
        s1.attack();

        Swordsman s3 = (Swordsman) s1.clone();
        System.out.println(s1);
        System.out.println("Cloned " + s2);
        System.out.println("Cloned 2 " + s3);


        General general = new General();
        System.out.println(general);
        General copy = (General) general.clone();
    }

}
