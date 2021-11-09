import java.util.Scanner;

class Person{
String name;
}
class Student{
String student;
}
class Teacher extends Person{
    int salary;
    String subject;
    Teacher(int salary,String subject){
        this.salary=salary;
        this.subject=subject;
    }
    void show(){
        System.out.println(salary+ " "+subject);
    }
}
class CollegeStudent extends Student{
    int year;
    String major;
    CollegeStudent(int year,String major){
        this.major=major;
        this.year=year;
    }
    void show(){
        System.out.println(major+ " "+year);
    }
}
class HighSchool{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int salary=sc.nextInt();
       String subject=sc.nextLine();
        Teacher obj1=new Teacher(salary,subject);
        obj1.show();
        int year=sc.nextInt();
        String major=sc.nextLine();
        CollegeStudent obj2=new CollegeStudent(year,major);
    obj2.show();
    }
}