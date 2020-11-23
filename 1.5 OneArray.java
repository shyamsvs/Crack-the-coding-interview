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

    public boolean isOneWayArray(String str1, String str2){    
        int hash1[] = new int[26];
        int hash2[] = new int[26];
        int val;
        Arrays.fill(hash1, 0);
        Arrays.fill(hash2, 0);
        for(int i=0;i<str1.length();i++){
            val = str1.charAt(i) - 'a';
            hash1[val]++;
        }
        for(int i=0;i<str2.length();i++){
            val = str2.charAt(i) - 'a';
            hash2[val]++;
        }
        int change = 0;
        for(int i=0;i<26;i++){
            if(hash1[i] != hash2[i]){
                change++;
            }
        }
        if(str1.length() == str2.length())return change <= 2;
        return change == 1;
    }

    public static void main(String[] args) {
        //FastScanner fscanner = new FastScanner();    
        CrackTheInterview cci = new CrackTheInterview();
        Scanner scanner = new Scanner(System.in);    
        String s1 = "pales";
        String s2 = "pale";
        boolean ans = cci.isOneWayArray(s1,s2);
        System.out.println(ans);
        scanner.close();
    }        
} 
