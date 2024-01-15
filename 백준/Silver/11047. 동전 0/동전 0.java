import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N  = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] moneyList = new Integer[N];

        int cnt = 0;

        for(int i=0; i<N; i++){
            moneyList[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(moneyList, Collections.reverseOrder());

        for(int j=0; j<moneyList.length; j++){

            if(moneyList[j]<=K){
                cnt = cnt + K/moneyList[j];
                K = K%moneyList[j];
            }
            else{
                continue;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();


    }

}