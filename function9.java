//function overloading(using data type)
public class function9 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
     public static float sum(float a,float b,float c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(4,5));
        System.out.println(sum(4.5f,6.8f));
        System.out.println(sum(4.6f,6.9f,7.8f));

    }
    
}
