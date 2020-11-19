import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public boolean isUnique(String st){
        if(st.length() > 128)return false;
        boolean[] char_set = new boolean[128];
        for(int i=0;i<st.length();i++){
            int val = st.charAt(i);
            if(char_set[val] == true){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        //FastScanner fscanner = new FastScanner();    
        CrackTheInterview cci = new CrackTheInterview();
        Scanner scanner = new Scanner(System.in);    
        String array = scanner.nextLine();
        boolean isUni = cci.isUnique(array);
        System.out.println(isUni);
        scanner.close();
    }        
} 
