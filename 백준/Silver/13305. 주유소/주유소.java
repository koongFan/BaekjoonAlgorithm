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

        int N = Integer.parseInt(br.readLine());

        long[] distanceArr = new long[N-1];

        long[] oilPriceArr = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());  

        long sum = 0;

        long oilPrice;
        long nextDistance = 0;

        for(int i=0; i<N-1; i++){
            distanceArr[i] = Integer.parseInt(st.nextToken());
        }
        long totalDistance = Arrays.stream(distanceArr).sum();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            oilPriceArr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            oilPrice = oilPriceArr[i];
            if(i == 0 && oilPrice == 1){
                sum = oilPrice * totalDistance;
                break;
            }
            else{

                for(int j= i+1; j<N; j++){
                    long nextPrice = oilPriceArr[j];
                        nextDistance += distanceArr[j-1];
                        if(oilPrice>nextPrice && j != oilPriceArr.length-1){
                            sum = sum + (oilPrice * nextDistance);
                            i = j;
                            i--;
                            nextDistance = 0;
                            break;
                        }
                        if(j == oilPriceArr.length-1){
                            sum = sum + (oilPrice * nextDistance);
                            i = N;
                            break;
                        }
                }

            }

        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }
}