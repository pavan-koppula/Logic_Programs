// WAP to print 1 to 10 numbers and find its average
import java.util.*;
class Avg_10 {
    public static void main(String[] args) {
        int ar[]=new int[10];   //Array declaration
        int sum=0;
        for(int i=0;i<ar.length;i++){  //array Index=0,1,2,3,4,5,6,78,9
            ar[i]=i+1;          //ar[0,1,2,3,4,5,...9]=1,2,3,4,5,6,7,8,9,10
            sum=sum+ar[i];
        }
        System.out.println(Arrays.toString(ar));    //Generate a string representation of an array(To print the contents of an array)
        System.out.println("Sum of the Numbers in the array: "+sum);
//To find average of 1 to 10
        int avg=sum/(ar.length/2);
        System.out.println("Average of given Numbers: "+avg);
    }
}
