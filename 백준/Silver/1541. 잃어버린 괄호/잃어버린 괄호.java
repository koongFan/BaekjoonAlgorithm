import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sikArr = br.readLine().split("-");
        int answer = 0;

        for(int i=0; i<sikArr.length; i++){

            String[] tempArr = sikArr[i].split("\\+");
            int tempSum = 0;
            for(int j=0; j<tempArr.length; j++){
                tempSum += Integer.parseInt(tempArr[j]);
            }

            if(i == 0)
                answer = tempSum;
            else
                answer -= tempSum;
        }
 
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();

    }

}