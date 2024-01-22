import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());


        int[] exchangeArr = {25,10,5,1};
        int[] arr = new int[T];

        int tmp;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<exchangeArr.length; j++){
                int remain = arr[i]%exchangeArr[j];
                tmp = arr[i]/exchangeArr[j];
                arr[i] = remain;

                sb.append(tmp);
                if(j != exchangeArr.length-1){
                    sb.append(" ");
                }
                else{
                    sb.append("\n");
                }
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
