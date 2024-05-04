//Smallest number in array
import java.util.Scanner;
public class array9 {
    public static int getSmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;

    }
    public static void main(String args[]){
        int numbers[]={12,4,5,8,9,5,10};
        System.out.println(getSmallest(numbers));

    }
}
