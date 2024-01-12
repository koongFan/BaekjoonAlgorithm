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

            int needMinute = Integer.parseInt(br.readLine());

            if(minute + needMinute >= 60){   

                int plusHour = (minute + needMinute)/60;
                int remainMinuite = (minute + needMinute)%60;

                hour = hour + plusHour;
                minute = remainMinuite;

                bw.write(String.valueOf(hour>=24 ? hour-24 : hour) + " " + String.valueOf(minute==60 ? 0:minute));
            }
            else{
                bw.write(String.valueOf(hour) + " " + String.valueOf(minute + needMinute == 60 ? 0 : minute + needMinute));
            }

            br.close();
            bw.flush();
            bw.close();
    }

}