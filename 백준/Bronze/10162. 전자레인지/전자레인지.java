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

        int T = Integer.parseInt(br.readLine());
        int[] timer = {300, 60, 10};
        StringBuilder sb = new StringBuilder();

        int tmp = T;

        for(int i=0; i<timer.length; i++){
            if(T<timer[i]){
                sb.append("0");
            }
            else{
                tmp = T/timer[i];
                T  = T%timer[i];
                sb.append(tmp);
            }
            sb.append(" ");
            if(i == timer.length-1 && T != 0){
                sb.setLength(0);
                sb.append("-1");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
