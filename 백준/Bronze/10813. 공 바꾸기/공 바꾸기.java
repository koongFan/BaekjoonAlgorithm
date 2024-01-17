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

        // 값 할당
        for(int i=0; i<N; i++){
            boxArr[i] = i+1;
        }

        int I,J;
        // 변경
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            I = Integer.parseInt(st.nextToken());
            J = Integer.parseInt(st.nextToken());
            int tmpI = boxArr[I-1];
            int tmpJ = boxArr[J-1];
            boxArr[I-1] = tmpJ;
            boxArr[J-1] = tmpI;
        }

        for(int i =0; i<boxArr.length; i++){
            System.out.println(boxArr[i]);
        }


    }

}