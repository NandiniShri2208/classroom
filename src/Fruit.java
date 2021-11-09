public class Fruit {
    String name;
    String taste;
    int size;
    void eat(){
        System.out.println("i am fruit");
        System.out.println("i am sweet in taste");
    }
}
class Apple extends Fruit{
    //@Override
    void eat(){
        System.out.println("i am apple 'an apple in a day keeps doctor away' ");
        System.out.println(" i am sweet in taste");
    }
}
class Orange extends Fruit{
   // @Override
    void eat(){
        System.out.println("i am in orange");
        System.out.println(" i am khatta -meetha in swad");
    }


}
class FruitMain{
    public static void main(String[] args) {
       Fruit obj=new Fruit();
       Orange obj1=new Orange();
        obj1.eat();
    }
}

