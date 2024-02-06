import java.util.*;
class Prime2 {
    public static void main(String[] args) {
        int n=10;
        for(int i=2;i<=n; i++){       //i=2,3,4,5,6,7,8,9,10
            int count=0;
            for(int j=2;j<i; j++){    //j=2,3,4,5,6,7,8,9
                if(i%j==0){           //2%2=0. 3%2!=0,3%3=0. 4%2=0,4%3!=0,4%4=0. ..............
                    count++;
                }
            }
        if(count==0){
            System.out.println(i);
        }
        }
    }
}

//----------------------------------Another Logic------------------------------------------

import java.util.*;
class Prime2 {
    public static void main(String[] args) {
        int n=10;
        for(int i=2;i<=n; i++){
            int count=0;
            for(int j=1;j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
        if(count==2){
            System.out.println(i);
        }
        }
    }
}
