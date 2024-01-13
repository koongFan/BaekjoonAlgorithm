import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int total = 0;

        for(int i=n; i>0; i--){

            total = total + i;

        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();

    }

}