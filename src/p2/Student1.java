package p2;

public class Student1 {
    String name;
    float percentage;
    Student1(String name,float percentage){
        this.name=name;
        this.percentage=percentage;
    }
}
class TestMain {
    public static void main(String[] args) {
        float max=0.0f;
        int p=0;
        Student1 arr[] = new Student1[3];
        arr[0] = new Student1("pari", 95.87f);
        arr[1] = new Student1("khushi", 100.4f);
        arr[2] = new Student1("navya", 99.2f);
        for(int i=0;i<3;i++){
            if(max<arr[i].percentage){
                max=arr[i].percentage;
                p=i;
            }
        }
        System.out.println(arr[p].name + " "+ arr[p].percentage);
    }
}
