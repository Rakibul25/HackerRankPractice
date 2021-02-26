import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static String findDay(int month, int day, int year) {
                int intyear = year;
                int intDay = day;
                int intmonth = month;
        
                String dateString = String.format("%d-%d-%d", intyear, intmonth, intDay);
                Date date = null;
                try {
                     date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
                }
                catch(ParseException ref){
                    ref.printStackTrace();
                }  
            
                // Then get the day of week from the Date based on specific locale.
                String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
                
                return dayOfWeek.toUpperCase();
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}