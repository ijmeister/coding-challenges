import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution28 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        ArrayList<String> names = new ArrayList<String>();

        while(n --> 0) {
            String input = sc.nextLine();
            String[] inputArray = input.split(" ");
            String firstName = inputArray[ 0 ];
            String emailID = inputArray[ 1 ];

            Pattern p = Pattern.compile(".*@gmail.com");
            if(p.matcher(emailID).matches()){
                names.add(firstName);
            }

            // regex
            // String myRegExString = "\\w*@gmail.com$";

            // // Create a Pattern object (compiled RegEx) and save it as 'p'
            // Pattern p = Pattern.compile(myRegExString);

            // // We need a Matcher to match our compiled RegEx to a String
            // Matcher m = p.matcher(emailID);

            // // if our Matcher finds a match
            // if( m.find() ) {
            //     // Print the match
            //     // System.out.println( m.group() );
            //     names.add(firstName);
            // }
        }
        sc.close();

        // sort
        Collections.sort(names);
        for(String name:names) {
            System.out.println(name);
        }
    }
}
