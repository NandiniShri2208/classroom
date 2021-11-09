import java.util.Scanner;

interface LibraryUser{
    void registerAccount();
    void requestBook();
}
class KidUsers implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(){
       if(age<12){
           System.out.println("You have successfully registered under a kids account");
       }
       else{
           System.out.println("Sorry,Age must be less than 12 to register as a kid");
        }
    }
    public void requestBook(){
        if(bookType == "Kids"){
            System.out.println("Book issued successfully,please return the book within 10 days");
        }
        else{
            System.out.println("Oops,you are aalowed to take only kids book");
        }

    }

}


class AdultUser implements LibraryUser {
    int age;
    String bookType;

    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an adult  account");
        } else {
            System.out.println("Sorry,Age must be greater than 12 to register as an adult");
        }
    }

    public void requestBook() {
        if (bookType == "Fiction") {
            System.out.println("Book issued successfully,please return the book within 7 days");
        } else {
            System.out.println("Oops,you are allowed to take only adult Fiction books");
        }


    }
}
class LibraryInterfaceDemo{
    public static void main(String[] args) {
//        KidUsers obj1=new KidUsers();
//        obj1.age=10;
//        obj1.registerAccount();
//        obj1.age=18;
//        obj1.registerAccount();
//        obj1.bookType="Kids";
//        obj1.requestBook();
//        obj1.bookType="Fiction";
//        obj1.requestBook();
//        AdultUser obj2=new AdultUser();
//        obj2.age=5;
//        obj2.registerAccount();
//        obj2.age=23;
//        obj2.registerAccount();
//        obj2.bookType="Kids";
//        obj2.requestBook();
//        obj2.bookType="Fiction";
//        obj2.requestBook();
//        Scanner s=new Scanner(System.in);
//        //TESTCASE-01
//        KidUsers obj1=new KidUsers();
//        System.out.println("Enter your age");
//obj1.registerAccount();
    }
}