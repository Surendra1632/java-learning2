import java.util.Scanner;
public class aaray2 {
    public static void main( String args[]){
       
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[50];
       // Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        System.out.println("phy:"+marks[0]);
        System.out.println("chem:"+marks[1]);
        System.out.println("math:"+marks[2]);
        System.out.println("eng:"+marks[3]);

        


    }
    
}
