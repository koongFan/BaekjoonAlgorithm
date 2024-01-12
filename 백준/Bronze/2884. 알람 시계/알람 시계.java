import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalTime;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());

            LocalTime setTime = LocalTime.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            String[] returnTime = setTime.minusMinutes(45).toString().split(":");
            int hour = Integer.valueOf(returnTime[0]);
            int minute = Integer.valueOf(returnTime[1]);

            bw.write(String.valueOf(hour) + " " + String.valueOf(minute));

            br.close();
            bw.flush();
            bw.close();
    }

}