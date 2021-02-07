import java.util.*;
import java.io.*;


class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int term = a;
            Math math = new Math();
            for(int j=0;j<n;j++)
            {
                term=term+(math.pow1(j)*b);
                System.out.print(term+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
class Math{
    int i;
    int pow1(int b){
        int a=1;
        for(i = 0;i<b; i++){
            a = a*2;
        }
        return a;
    }
}