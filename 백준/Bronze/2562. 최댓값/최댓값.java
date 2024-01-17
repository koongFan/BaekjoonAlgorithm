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

        int[] arr = {
            Integer.parseInt(br.readLine())
            ,Integer.parseInt(br.readLine())
            ,Integer.parseInt(br.readLine())
            ,Integer.parseInt(br.readLine())
            ,Integer.parseInt(br.readLine())
            ,Integer.parseInt(br.readLine())
            ,Integer.parseInt(br.readLine())
            ,Integer.parseInt(br.readLine())
            ,Integer.parseInt(br.readLine())
        };

        int max = arr[0];
        int idx = 1;

        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                idx = i+1;
                max = arr[i];
            }   
        }
        
        bw.write(String.valueOf(max) + "\n" + String.valueOf(idx));
        bw.flush();
        br.close();
        bw.close();

    }

}