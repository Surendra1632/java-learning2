//largest number
import java.util.Scanner;
public class array8 {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,7,8,9,5,10};
        System.out.println(getLargest(numbers));
        
    }
}