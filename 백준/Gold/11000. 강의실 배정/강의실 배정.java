import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] timeArr = new int[N][2];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            timeArr[i][0] = Integer.parseInt(st.nextToken());
            timeArr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(timeArr, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(timeArr[0][1]);

        for(int i=1; i<timeArr.length; i++){
            if(pq.peek() <= timeArr[i][0]){
                pq.poll();
            }
            pq.offer(timeArr[i][1]);
        }

        bw.write(String.valueOf(pq.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}
