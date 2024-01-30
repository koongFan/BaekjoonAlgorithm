import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int minusCnt = 0;
        int ans = 0;

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if( arr[i] <= 0 ){ minusCnt++; }
        }

        Arrays.sort(arr);

        for(int i=1; i<minusCnt; i+=2){
            ans += arr[i-1] * arr[i];
        }

        if(minusCnt % 2 == 1){
            ans +=  arr[minusCnt-1];
        }

        if((N-minusCnt)%2 == 1){
            ans +=  arr[minusCnt];
        }

        for(int i=N-1; i>minusCnt; i-=2){
            int mul = arr[i] * arr[i-1];
            int sum = arr[i] + arr[i-1];

            ans += mul>sum ? mul : sum;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        br.close();
        bw.close();
        

    }
}
