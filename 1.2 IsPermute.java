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

public class CrackTheInterview extends FastScanner {    

    public String sort(String s){
        char temp_array[] = s.toCharArray();
        Arrays.sort(temp_array);
        return new String(temp_array);
    }

    public boolean isAPermutation(String st1,String st2){
        if(st1.length() != st2.length())return false;
        return sort(st1).equals(sort(st2));        
    }

    public static void main(String[] args) {
        //FastScanner fscanner = new FastScanner();    
        CrackTheInterview cci = new CrackTheInterview();
        Scanner scanner = new Scanner(System.in);    
        String array1 = scanner.nextLine();
        String array2 = scanner.nextLine();
        boolean isPermute = cci.isAPermutation(array1,array2);
        System.out.println(isPermute);
        scanner.close();
    }        
} 
