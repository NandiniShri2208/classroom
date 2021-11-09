import java.util.Scanner;

public class Student_1 {
    String name;
    Student_1(){
        name="unknown";
    }
    Student_1(String name){
        this.name=name;
    }
    void show(){
        System.out.println(name);
    }
}
class Student__1Main{
    public static void main(String[] args) {
        //Student_1 obj=new Student_1();
        //obj.show();
        //Student_1 obj1=new Student_1("nandini shrivastav");
        //obj1.show();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String name=sc.nextLine();
            Student_1 obj=new Student_1(name);
            obj.show();
        }
    }
}
