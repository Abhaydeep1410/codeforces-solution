//  C. Target Practice

import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.*;
import java.util.*;

public class Main {
    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = 1;
        t = fs.nextInt(); // Uncomment if multiple testcases
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() {
        char[][] arr=new char[10][10];
        int ans=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                arr[i][j]=fs.next().charAt(0);
                if(arr[i][j]=='X'){
                    
                }
            }
        }
    }

    // ---------- Fast Input ----------
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
