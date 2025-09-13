//  B. Sequence Game

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
        // Example problem-solving code:
        int n = fs.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++) {
            int temp=fs.nextInt();
            if(i==0) arr.add(temp);
            else{
                if(arr.get(arr.size()-1)<=temp) arr.add(temp);
                else {
                    arr.add(temp);
                    arr.add(temp);
                }
            }

        }

        out.println(n);
        for(int i=0;i<arr.size();i++) out.print(arr.get(i)+" ");
        out.println();
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
