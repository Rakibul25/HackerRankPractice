import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            list.add(scanner.nextInt());
        }
        int numQueries = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0;i < numQueries;i++){
            String queryType = scanner.nextLine();
            if(queryType.equals("Insert")){
                String[] queryArray = scanner.nextLine().split(" ");
                list.add(Integer.parseInt(queryArray[0]),Integer.parseInt(queryArray[1]));
            }else{
                int removeIndex = Integer.parseInt(scanner.nextLine());
                list.remove(removeIndex);
            }  
        }
        for(Integer num : list){
            System.out.print(num+" ");
        }
    }
}