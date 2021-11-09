import java.util.Scanner;

public class Car1 {
String manufacturer;
float price;
Car1(String manufacturer,float price){
  this.manufacturer=manufacturer;
  this.price=price;
}
void show(){
    System.out.println(manufacturer+ " "+ price);
}
}
class carMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++){
            Car1 obj=new Car1(sc.next(),sc.nextFloat());
           obj.show();
        }



    }
}
