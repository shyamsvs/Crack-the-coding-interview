import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class FastScanner {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer("");
    String next() {
        while (!st.hasMoreTokens())
            try {
                st=new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        return st.nextToken();
    }
    
    int nextInt() {
        return Integer.parseInt(next());
    }
    int[] readArray(int n) {
        int[] a=new int[n];
        for (int i=0; i<n; i++) a[i]=nextInt();
        return a;
    }
    long nextLong() {
        return Long.parseLong(next());
    }
}

public class CrackTheInterview {    

    public String stringCompression(String copy){        
        StringBuilder res = new StringBuilder();
        int index = 0;
        int count = 0;
        for(index=0; index < copy.length();index++){
            count++;
            if(index + 1 >= copy.length() || copy.charAt(index) != copy.charAt(index + 1)){
                res.append(copy.charAt(index));
                res.append(count);
                count = 0;
            }
        }
        return copy.length() < res.length() ? copy : res.toString();
    }
    

    public static void main(String[] args) {
        //FastScanner fscanner = new FastScanner();    
        CrackTheInterview cci = new CrackTheInterview();
        Scanner scanner = new Scanner(System.in);
        String s = "aaaaabbbbaaaabbddc";
        s = cci.stringCompression(s);
        System.out.println(s);
        scanner.close();
    }        
} 
