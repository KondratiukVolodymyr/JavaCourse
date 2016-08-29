package clone;


public class Clone_test {
    public static void main(String[] args) throws CloneNotSupportedException {
        FamilyMember father = new FamilyMember("Vasya", 45);
        FamilyMember father2 = new FamilyMember("Gena", 48);

        FamilyMember son = new FamilyMember("Kolya", 20);

        son.setFather(father);
        FamilyMember clone = (FamilyMember) son.clone();
        System.out.println("--------------before--------------");
        System.out.println(son);
        System.out.println(clone);

        son.setFather(father2);
        System.out.println("---------------after--------------");
        System.out.println(son);
        System.out.println(clone);




    }


}
