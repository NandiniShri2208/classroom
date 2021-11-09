public interface CallBack {
    void callBack(int param);
    //void nonIfaceMeth();
}
class client implements CallBack{

     public void callBack(int p){
         System.out.println("callback called with:"+p);
    }
   public void nonIfaceMeth(){
        System.out.println("classes that implements interfaces"+
                "may,also define other members  too.....");
    }
}
class AnotherClient implements CallBack{
    public void callBack(int p){
        System.out.println("another version of callback..");
        System.out.println("p squared is.."+p*p);
    }
    }
class TestIFace{
    public static void main(String[] args) {
        CallBack c=new client();
        AnotherClient obj=new AnotherClient();
        c.callBack(12);
        c=obj;
        c.callBack(12);
//        c.nonIfaceMeth();


    }
}
