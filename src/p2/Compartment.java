package p2;
import java.util.concurrent.ThreadLocalRandom;
abstract class Compartment {
   public abstract String notice();
}
class FirstClass extends Compartment{
    public String notice(){
        String s="this is compartment of firstclass";
       return s;
    }
}
class Ladies extends Compartment{
    public String notice(){
        String t="this is compartment of Ladies class";
        return t;
    }
}
class General extends Compartment{
    public String notice(){
        String p="this is compartment of General class";
        return p;
    }
}
class Luggage extends Compartment{
    public String notice(){
        String q="this is compartment of  Luggage class";
        return  q;
    }
}
class TestCompartment{
    public static void main(String[] args) {
        FirstClass obj=new FirstClass();
        Ladies obj1=new Ladies();
        General obj2=new General();
        Luggage obj3=new Luggage();
        Compartment[] arr=new Compartment[10];
        for(int i=0;i<10;i++)
        {
        int compartment = ThreadLocalRandom.current().nextInt(1,5);
if(compartment == 1){
    System.out.println(obj.notice());
}
if(compartment == 2){
            System.out.println(obj1.notice());
        }

if(compartment == 3){
    System.out.println(obj2.notice());
}
if(compartment == 4){
    System.out.println(obj3.notice());
}


    }
    }
}