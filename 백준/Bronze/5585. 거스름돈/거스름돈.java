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

        int T = 1000-Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] exchange = {500,100,50,10,5,1};
        int cnt = 0;
        for(int i=0; i<exchange.length; i++){
            if(T<exchange[i]){
                continue;
            }
            else{
                cnt = cnt + (T/exchange[i]);
                T = T%exchange[i];
            }
        }
        sb.append(cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
