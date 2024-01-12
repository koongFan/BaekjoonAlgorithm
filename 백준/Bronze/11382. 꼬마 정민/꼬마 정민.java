import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] inputValue = br.readLine().split(" ");

            Long A = Long.parseLong(inputValue[0]);
            Long B = Long.parseLong(inputValue[1]);
            Long C = Long.parseLong(inputValue[2]);

            bw.write(String.valueOf(A+B+C));
            bw.close();
    }

}