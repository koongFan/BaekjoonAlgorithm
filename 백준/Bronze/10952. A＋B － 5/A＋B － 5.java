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

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int A,B;
        
        

        while(true){
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if (A != 0 && B != 0) {
                sb.append((A+B) + "\n");
            }
            else{
                break;
            }
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}