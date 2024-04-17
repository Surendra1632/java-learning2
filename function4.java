import java.util.Scanner;
public class function4 {
    public static int multiply(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int multi=a*b;
        System.out.println("mul="+multi);
        return multi;
    }
    public static void main(String args[]){
        multiply();
       

    }
    
}
