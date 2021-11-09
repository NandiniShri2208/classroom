@FunctionalInterface
interface i1{
    public void m1();//only one abstract method in functional interface
   // public void m2();
}
//interface can be inherited
@FunctionalInterface
interface i3 extends i1{

}