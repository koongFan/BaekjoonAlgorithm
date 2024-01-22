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
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String seat = br.readLine();
        String tmp = "";

        for(int i=0; i<seat.length(); i++){
            char str = seat.charAt(i);
            if(str == 'S'){
                tmp = tmp + "*S";
            }
            else{
                tmp = tmp + "*LL";
                i++;
            }
        }
        tmp = tmp + "*";
        int cnt = 0;
        for(int i=0; i<tmp.length(); i++){
            if(tmp.charAt(i) == '*'){
                cnt++;
            }
            else{
                continue;
            }
        }
        cnt = cnt>N ? N:cnt;
        sb.append(cnt);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
