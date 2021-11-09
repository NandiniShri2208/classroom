import java.util.Scanner;

//import java.util.Scanner;
//
//class stu{
//    int rollNo;
//    String sName;
//    String subMarks[];
//    Scanner sc=new Scanner(System.in);
//    stu(){
//        subMarks =new String[5];
//        for(int i=0;i<5;i++){
//
//            subMarks[i]=sc.nextLine();
//        }
//    }
//    void show(){
//        for (String i:
//             subMarks) {
//            System.out.println(i);
//        }
//    }
//}
//class array{
//    public static void main(String[] args) {
//
//        stu obj=new stu();
//        obj.show();
//    }
//}
//class Emp{
//    public int eid;
//    public String name;
//    Emp(int eid,String name){
//        this.eid=eid;
//        this.name=name;
//    }
//    public  void show(){
//        System.out.println(eid+" "+name);
//    }
//}
//class empMain{
//    public static void main(String[] args) {
//        Emp arr[]=new Emp[5];
//        Emp obj1=new Emp(1001,"nandini");
//        Emp obj2=new Emp(1002,"khushi");
//        Emp obj3=new Emp(1003,"yashu");
//        arr[0]=obj1;
//        arr[1]=obj2;
//        arr[2]=obj3;
//        arr[3]=obj1;
//        arr[4]=obj2;
//       for(int i=0;i<arr.length;++i){
//           System.out.println(arr[i].eid);
//           System.out.println(arr[i].name);
//       }
//    }
//}

class Mian{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][];
     arr[0]=new int[2];
     arr[1]=new int[3];
     arr[2]=new int[5];
     for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[i].length;j++){
             int n=sc.nextInt();
             arr[i][j]=n;
             System.out.println(arr[i][j]+ " ");
         }
     }

    }
}





















