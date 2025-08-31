//  A. Doremy's Paint 3

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
        // Example problem-solving code:
        int n = fs.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int temp=fs.nextInt();
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
if(map.size()>=3) {
    out.println("No");
}else {
    if (map.size() == 1) out.println("Yes");
    else {
        List<Integer> c = new ArrayList<>(map.values());
        if (c.get(0) == c.get(1) || Math.abs(c.get(0) - c.get(1)) == 1) out.println("Yesy");
        else out.println("No");
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
