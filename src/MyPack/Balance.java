package MyPack;

import java.util.Scanner;

public class Balance {
    String name;
    double bal;
    Balance(String n,double b)
    {
        name=n;
        bal=b;
    }
    void show(){
        if(bal<0){
            System.out.println("-->");
        }
        System.out.println(name+":$"+bal);
    }
}
class AccountBalance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        double d;
        int n=sc.nextInt();
//        Balance current[]=new Balance[n];
//        for(int i=0;i<n;i++){
        System.out.println("enter string value");
        sc.next();
s=sc.nextLine();
System.out.println("enter double value");
d=sc.nextDouble();
        System.out.println(n+" "+s+" "+d);
        System.out.println(s.length());
//            current[i]=new Balance(s,d);
        //}
        sc.close();


//        current[0]=new Balance("K.J.Fielding",123.23);
//        current[1]=new Balance("Will Tell",157.02);
//        current[2]=new Balance("TOM JACKSON",-12.33);
//        for(int i=0;i<n;i++){
//            current[i].show();
//        }
    }
}
