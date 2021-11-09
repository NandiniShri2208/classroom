interface i2{
    abstract public void  m1();
}



public class ann1 {
    public static void main(String[] args) {
        i2 obj=(() -> System.out.println("ok"));
    }
}
