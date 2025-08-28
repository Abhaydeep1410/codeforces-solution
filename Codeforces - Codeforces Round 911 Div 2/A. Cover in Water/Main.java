//  A. Cover in Water

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
        t = fs.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() {
        int n = fs.nextInt();
        String s=fs.next();

        int countdots=0,countmaxdot=0;
        for(int i=0;i<n;i++) {
            if(s.charAt(i)=='.') {
                countdots++;
                countmaxdot++;
                if(countmaxdot>=3){
                    out.println(2);
                    return ;
                }
            }else{
                countmaxdot=0;
            }
        }
        out.println(countdots);
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
