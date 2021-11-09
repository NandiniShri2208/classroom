package p2;

import java.util.Scanner;

public class Room {
    boolean AC_ON;
    boolean HOME_THEATRE_ON;
    boolean FAN_ON;
    boolean LIGHT_ON;
    final int max_a=1200;
   final  int max_b=600;
    final int max_c=400;
    final int max_d=100;

    public Room(boolean AC_ON,boolean HOME_THEATRE_ON, boolean FAN_ON,boolean LIGHT_ON) {
        this.AC_ON = AC_ON;
        this.HOME_THEATRE_ON=HOME_THEATRE_ON;
        this.FAN_ON=FAN_ON;
        this.LIGHT_ON=LIGHT_ON;
    }
    void showmsg(){
        int power=0;
       if(AC_ON == true){
           power+=max_a;
       }
       if(HOME_THEATRE_ON == true){
           power+=max_b;
       }
        if (FAN_ON == true){
            power+=max_c;
        }
        if(LIGHT_ON == true){

            power+=max_d;
        }
        if(power>2000){
            System.out.println("Overloaded....");
        }

            System.out.println(power);
    }
    }
    //ac-1200w,ht=600w,fan-400w,l=100w;
    //2kw>overload


class Sample{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean a,b,c,d;
        System.out.println("how many objects of class Room u want to create");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a=sc.nextBoolean();
            b=sc.nextBoolean();
            c=sc.nextBoolean();
            d=sc.nextBoolean();
            Room obj=new Room(a,b,c,d);
            obj.showmsg();
        }
    }
}