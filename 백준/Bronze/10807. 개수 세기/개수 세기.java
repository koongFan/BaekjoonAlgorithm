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

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int findCnt = 0;

        for(int i=0; i<arr.length; i++){
            if(Integer.parseInt(arr[i])==v)
                findCnt = findCnt + 1;
            else continue;
        }

        bw.write(String.valueOf(findCnt));
        bw.flush();
        bw.close();
        br.close();

    }

}