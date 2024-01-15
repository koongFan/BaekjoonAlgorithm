import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] timeArr = new int[N];
        int time = 0;
        int[] needTime = new int[N];
        
        for(int i=0; i<N; i++){
            timeArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(timeArr);

        for(int i=0; i<timeArr.length; i++){
            time = time + timeArr[i];
            needTime[i] = time;
        }

        int sum = Arrays.stream(needTime).sum();
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }
}