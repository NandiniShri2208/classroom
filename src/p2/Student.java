package p2;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    String address;

    public Student() {
     name="unknown";
       age=0;
        address = "not available";
    }
    void setInfo(String name,int age){
        this.name=name;
        this.age=age;
    }
    void setInfo(String name,int age,String address){

        this.name=name;
        this.age=age;
        this.address=address;
    }


    void show(){
        System.out.println(name+ " "+age+" "+address);

    }
}
class StudentMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            Student obj = new Student();
obj.setInfo(sc.next(),sc.nextInt());
            obj.show();
        }
    }
}