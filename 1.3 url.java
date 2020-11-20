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

public class CrackTheInterview {    

    public String Url(String url,int trueLenght){
        int spaceCount = 0;
        int i=0;        
        for(i=0;i<trueLenght;i++){
            if(url.charAt(i) == ' '){
                spaceCount++;
            }
        }
        int index = trueLenght + spaceCount * 2;
        //if(trueLenght < stringArray.length) stringArray[trueLenght] = '\0';
        StringBuilder str = new StringBuilder(url);
        for(i = trueLenght - 1; i>=0 ;i--){
            if(url.charAt(i) == 32){                
                str.setCharAt(index - 1, '0');
                str.setCharAt(index - 2, '2');
                str.setCharAt(index - 3, '%');
                index = index - 3;
            }
            else{
                str.setCharAt(index - 1, url.charAt(i));
                index--;
            }
        }
        return new String(str);
    }

    public static void main(String[] args) {
        //FastScanner fscanner = new FastScanner();    
        CrackTheInterview cci = new CrackTheInterview();
        Scanner scanner = new Scanner(System.in);    
        //int trueLength = scanner.nextInt();
        //String url = scanner.nextLine();
        String url = "Mr John Smith     ";
        int trueLength = 13;
        String ans = cci.Url(url,trueLength);
        System.out.println(ans);
        scanner.close();
    }        
} 
