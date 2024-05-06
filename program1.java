//wap to print name age any city and pincode on screen (using class)
import java.util.Scanner;
public class program1 {
    String name;
    int age;
    int pincode;
    public program1(String name,int age,int pincode){
        this.name=name;
        this.age=age;
        this.pincode=pincode;
    }
    public void sure()
    {
       System.out.println("name:="+name);
       System.out.println("Age:="+age);
       System.out.println("pincode="+pincode);


    }
    public static void main(String args[])
    {
        program1 person =new program1("surendra",23,230001);
         person.sure();

    }
    
}
