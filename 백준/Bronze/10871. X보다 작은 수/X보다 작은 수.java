import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int X  = Integer.parseInt(st.nextToken());

        String[] arr = br.readLine().split(" ");

        for(int i=0; i<N; i++){
            if (Integer.parseInt(arr[i])<X) {
                sb.append(arr[i] + (i==N-1 ? "": " "));
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();



    }

}