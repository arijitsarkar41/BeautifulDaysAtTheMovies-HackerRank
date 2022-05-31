import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) 
    {
    	int  count=0, m=0, f=0;
    	for(int x=i;x<=j;x++)
    	{
    		int rev=0;
    		f=x;
    		while(f>0)
    		{
    			m=f%10;
    			rev=rev*10+m;
    			f=f/10;
    		}
    		if(((Math.abs(x-rev))%k)==0)
    			count++;
    		
    	}
    		return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
