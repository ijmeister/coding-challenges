import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Solution26 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // System.out.println("Hello");
        Scanner sc=new Scanner(System.in);
        String returnDateStr = sc.nextLine();
        String expectDateStr = sc.nextLine();
        sc.close();
        // String[] expectDateArr = expectDateStr.split(" ");
        // String[] returnDateArr = returnDateStr.split(" ");

        // Date expectDate = new Date(Integer.parseInt(expectDateArr[2]), Integer.parseInt(expectDateArr[1]), Integer.parseInt(expectDateArr[0]));
        // Date returnDate = new Date(Integer.parseInt(returnDateArr[2]), Integer.parseInt(returnDateArr[1]), Integer.parseInt(returnDateArr[0]));
        SimpleDateFormat sdf = new SimpleDateFormat("d M yyyy");
        Date expectDate = null;
        Date returnDate = null;
        Calendar expectCal = Calendar.getInstance();
        Calendar returnCal = Calendar.getInstance();
        try {
            expectDate = sdf.parse(expectDateStr);
            returnDate = sdf.parse(returnDateStr);
            expectCal.setTime(expectDate);
            returnCal.setTime(returnDate);
            // System.out.println(expectDate.toString());
        } catch(Exception e) {
            System.err.println(e);
        }
        // return -1 when returnDate is earlier than expected Date, 0 if equal, 1 if later
        if(returnDate.compareTo(expectDate) <= 0) {
            // no fine
            System.out.println(0);
        } else {
            // fine
            if(returnCal.get(Calendar.MONTH) == expectCal.get(Calendar.MONTH) && returnCal.get(Calendar.YEAR) == expectCal.get(Calendar.YEAR)) {
                // returned within the same month
                System.out.println(15 * (returnCal.get(Calendar.DAY_OF_MONTH) - expectCal.get(Calendar.DAY_OF_MONTH)));
            } else if(returnCal.get(Calendar.YEAR) == expectCal.get(Calendar.YEAR)) {
                // returned within the same year
                System.out.println(500 * (returnCal.get(Calendar.MONTH) - expectCal.get(Calendar.MONTH)));
            } else {
                // fixed fine
                System.out.println(10000);
            }
        }
    }
}
