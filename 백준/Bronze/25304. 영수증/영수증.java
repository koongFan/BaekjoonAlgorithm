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

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        StringTokenizer st;
        int price, qty;

        for(int i=0; i<N; i++){

            st = new StringTokenizer(br.readLine());

            price = Integer.parseInt(st.nextToken());
            qty = Integer.parseInt(st.nextToken());
            total = total + (price*qty);

        }

        bw.write(X==total ? "Yes" : "No");
        bw.flush();
        bw.close();
        br.close();

    }

}