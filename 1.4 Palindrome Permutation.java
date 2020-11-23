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

    public boolean isAPalindromePermutation(String str){      
        int counterForOddLetterLength = 0;
        char c;
        int val;
        int [] letterCount = new int[26];
        Arrays.fill(letterCount, 0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){    
                c = str.charAt(i);            
                val = Character.toLowerCase(c) - 'a';                
                letterCount[val]++;
            }
        }
        for(int i=0;i<26;i++){
            if(letterCount[i] %2 != 0){
                counterForOddLetterLength++;
            }                
        }
        return counterForOddLetterLength <= 1;
    }

    public static void main(String[] args) {
        //FastScanner fscanner = new FastScanner();    
        CrackTheInterview cci = new CrackTheInterview();
        Scanner scanner = new Scanner(System.in);    
        String s = "Rats live on no evil star";
        boolean ans = cci.isAPalindromePermutation(s);
        System.out.println(ans);
        scanner.close();
    }        
} 
