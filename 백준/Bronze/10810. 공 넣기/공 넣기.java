import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] boxArr = new int[N];

        int I,J,K;

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            I = Integer.parseInt(st.nextToken());
            J = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            for(int j= I-1; j< J; j++){
                boxArr[j] = K;
            }

        }

        StringBuilder sb = new StringBuilder();
        for(int x=0; x<boxArr.length; x++){
            sb.append(boxArr[x]);
            if( x != boxArr.length-1)
                sb.append(" ");
        }       

        System.out.println(sb);

    }

}