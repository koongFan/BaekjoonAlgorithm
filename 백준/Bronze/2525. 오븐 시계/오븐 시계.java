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

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());

            int hour = Integer.parseInt(st.nextToken());
            int minute = Integer.parseInt(st.nextToken());
            int ovenTimer = Integer.parseInt(br.readLine());
            
            hour = hour + (minute+ovenTimer)/60;
            minute = (minute+ovenTimer)%60;

            if(hour >= 24){
                hour = hour - 24;
            }

            bw.write(String.valueOf(hour) + " " + String.valueOf(minute));

            br.close();
            bw.flush();
            bw.close();
    }

}