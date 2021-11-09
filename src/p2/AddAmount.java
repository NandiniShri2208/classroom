package p2;

import java.util.Scanner;

public class AddAmount {
   int amount=50;
    AddAmount()
    {

    }
    AddAmount(int amount){
this.amount=this.amount+amount;
    }
    void show(){
        System.out.println(amount);
    }

}
class AddMain{
    public static void main(String[] args) {
        AddAmount obj1=new AddAmount();
        System.out.println(obj1.amount);
       obj1.show();
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        AddAmount obj2=new AddAmount(amt);
        obj2.show();
    }
}
